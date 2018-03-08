package main.java.com.core.fileOperateUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;

import main.java.com.core.exception.SystemException;

public class FileDownloadUtil {
 
	 
	 private static final String TEMPZIPS = "tempZIPs/"; 
	
	 
	    /** 
	     * 在某目录下创建新文件（非目录）,如果已存在，
	     * 则在文件名前加数字，直到创建成功
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * @param request 
	     * @param response 
	     * @param filesDir 文件夹存储位置
	     * @param storeName 
	     * @param contentType 
	     * @param realName 
	     * @throws Exception 
	     */
	 
	 
	 public static File createFile(String path,String fileName){
		    //path表示你所创建文件的路径
		    File parrentOfThisFile = new File(path);
		    
		    // fileName表示你创建的文件名；为txt类型；
		    File file = new File(parrentOfThisFile,fileName);
		   
		    if(!parrentOfThisFile.exists()){
		        parrentOfThisFile.mkdirs();
		    }
		    long i = parrentOfThisFile.list().length;
		    
		    while(file.exists()){
		    	
		    	file.renameTo(new File(parrentOfThisFile,i+"$"+fileName));
		    }
		    
		    try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new SystemException(e);
			}
		    return file;
	 }
	 /** 
     * 单个文件下载 
     *  
     * @author jamesY 
     * @date 2016-10-20 
     * @param request 
     * @param response 
     * @param filesDir 文件夹存储位置
     * @param storeName 
     * @param contentType 
     * @param realName 
     * @throws Exception 
     */  
    public static void downloadFile(HttpServletRequest request,  
            HttpServletResponse response, String filesDir, 
            String storeName, String contentType,  
            String realName) throws Exception {  
    	
        response.setContentType("text/html;charset=UTF-8");  
        request.setCharacterEncoding("UTF-8");  
        BufferedInputStream bis = null;  
        BufferedOutputStream bos = null;  
  
        
        String downLoadPath = filesDir + storeName;  
  
        long fileLength = new File(downLoadPath).length();  
  
        response.setContentType(contentType);  
        response.setHeader("Content-disposition", "attachment; filename="  
                + new String(realName.getBytes("utf-8"), "ISO8859-1"));  
        response.setHeader("Content-Length", String.valueOf(fileLength));  
  
        bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
        bos = new BufferedOutputStream(response.getOutputStream());  
        byte[] buff = new byte[2048];  
        int bytesRead;  
        while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
            bos.write(buff, 0, bytesRead);  
        }  
        bis.close();  
        bos.close();  
    } 
    
    /** 
     * 批量文件压缩后下载 
     *  
     * @author jamesY 
     * @date 2016-10-20 
     * @param request 
     * @param response 
     * @param filesDir 文件夹存储位置
     * @param storeNames 
     * @param contentType 
     * @param realNames 
     * @throws ServletException 
     * @throws IOException 
     */  
    public static String downloadFiles(HttpServletRequest request,  
            HttpServletResponse response, String filesDir, 
            String[] storeNames, String contentType) throws ServletException, IOException{
    	
    	List<File> files = new ArrayList<File>();
    	
    	for(String storeName : storeNames){
    		
    		File file = new File(filesDir+storeName);
    		files.add(file);
        }
    	
    	String fileName = UUID.randomUUID().toString() + ".zip";
    	String tempFilePath = request.getSession().getServletContext().getRealPath("/")
    			+ FileDownloadUtil.TEMPZIPS;
    	
    	//File tempFile = createFile(tempFilePath, fileName);
    	File file = new File(tempFilePath+fileName);
    	FileOutputStream outStream = new FileOutputStream(file);
    	ZipOutputStream toClient = new ZipOutputStream(outStream);
    	toClient.setEncoding("gbk");
    	zipFile(files, toClient);
        toClient.close();
        outStream.close();

       
        downloadFile(file, response);
    	
		return null;
    	
    }
    
    public static void zipFile(List<File> files, ZipOutputStream outputStream) throws IOException,ServletException{
    	try {
    		int size = files.size();
    		// 压缩列表中的文件
    		for (int i = 0; i < size; i++) {
    			File file = (File) files.get(i);
    			zipFile(file, outputStream);
    		}
    	} catch (IOException e) {
    		throw e;
    	}
    }
    
    public static void zipFile(File inputFile, ZipOutputStream outputstream) throws IOException,ServletException{
    	try {
    		if (inputFile.exists()) {
    			if (inputFile.isFile()) {
    				FileInputStream inStream = new FileInputStream(inputFile);
    				BufferedInputStream bInStream = new BufferedInputStream(
    						inStream);
    				ZipEntry entry = new ZipEntry(inputFile.getName());
    				outputstream.putNextEntry(entry);

    				final int MAX_BYTE = 10 * 1024 * 1024; // 最大的流为10M
    				byte[] inOutbyte; // byte数组接受文件的数据


    				long streamTotal = bInStream.available(); // 通过available方法取得输入流的最大字符数
    				int streamNum = (int) Math.floor(streamTotal / MAX_BYTE); // 取得流文件需要分开的数量
    				int leaveByte = (int) streamTotal % MAX_BYTE; // 分开文件之后,剩余的字节数量


    				if (streamNum > 0) {
    					for (int j = 0; j < streamNum; ++j) {
    						inOutbyte = new byte[MAX_BYTE];
    						//读入流,保存在byte数组
    						bInStream.read(inOutbyte, 0, MAX_BYTE);
    						outputstream.write(inOutbyte, 0, MAX_BYTE); // 写出流
    					}
    				}
    				//写出剩下的流数据
    				inOutbyte = new byte[leaveByte];
    				bInStream.read(inOutbyte, 0, leaveByte);
    				outputstream.write(inOutbyte);
    				outputstream.closeEntry(); // Closes the current ZIP entry
    				//and positions the stream for
    				//writing the next entry
    				bInStream.close(); // 关闭
    				inStream.close();
    			}
    		} else {
    			throw new ServletException("文件不存在！");
    		}
    	} catch (IOException e) {
    		throw e;
    	}
    }
    
    /** 
     * 单文件直接下载 
     *  
     * @author jamesY 
     * @date 2016-10-20 
     * @param request 
     * @param response 
     * @param filesDir 文件夹存储位置
     * @param storeNames 
     * @param contentType 
     * @param realNames 
     * @throws ServletException 
     * @throws IOException 
     */  
    public static void downloadFile(File file,HttpServletResponse response) {
        try {
            // 以流的形式下载文件。
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file.getPath()));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String(file.getName().getBytes("UTF-8"),"ISO-8859-1"));
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
            
         } 
         catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
