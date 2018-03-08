package main.java.com.core.fileOperateUtil;


import java.io.BufferedOutputStream;  
import java.io.File;  


import java.io.FileOutputStream;  
import java.io.IOException;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.List;  
import java.util.Map;  
  

import java.util.zip.ZipException;

import javax.servlet.http.HttpServletRequest;  
  
  







import main.java.com.core.exception.SystemException;

import org.apache.tools.zip.ZipEntry;  
import org.apache.tools.zip.ZipFile;
import org.apache.tools.zip.ZipOutputStream;  
import org.springframework.util.FileCopyUtils;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;  
import org.springframework.web.multipart.MultipartHttpServletRequest;  

public class FileUploadUtil {
	 private static final String REALNAME = "realName";  
	 private static final String STORENAME = "storeName";  
	 private static final String SIZE = "size";  
	 private static final String SUFFIX = "suffix";  
	 private static final String CONTENTTYPE = "contentType";  
	 private static final String CREATETIME = "createTime";  
	 private static final String UPLOADDIR = "uploadDir/"; 
	 private static final String ForderDir = "forderDir";
	  
	    /** 
	     * ���ϴ����ļ����������� 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20  
	     * @param name (����չ����)
	     * @return 
	     */  
	 public static String rename(String name) {  
	  
	     	Long now = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss")  
	                .format(new Date()));  
	        Long random = (long) (Math.random() * now);  
	        String fileName = now + "" + random;  
	  
	        if (name.indexOf(".") != -1) {  
	            fileName += name.substring(name.lastIndexOf("."));  //������չ��
	        }  
	  
	        return fileName;  
	 }  
	 
	    /** 
	     * ѹ������ļ��� 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20  
	     * @param name 
	     * @return 
	     */  
	  public static String zipName(String name) {  
	        String zipName = "";  
	        if (name.indexOf(".") != -1) {  
	        	zipName = name.substring(0, name.lastIndexOf("."));  
	        } else {  
	        	zipName = name;  
	        }  
	        return zipName + ".zip";  
	  }
	  
	    /** 
	     * ��ѹ���ļ� 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * @param file 
	     * @return zipFile
	     * @throws ZipException
	     * @throws IOException 
	     */  
	  
	  public static ZipFile zipFile(File file) throws ZipException, IOException {  
	       
	        ZipFile zipFile = new ZipFile(file);  
			return zipFile;  
	  }
	  
	  	/** 
	     * ��ѹ���ļ� 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * @param rootDir
	     * @param fileMap
	     * @return uploadedFilesInfo
	     * @throws  IOException 
	     */  
	  
	  public static List<Map<String, Object>> storeFile(String rootDir , Map<String, MultipartFile> fileMap) throws IOException{
		  
	
		  List<Map<String, Object>> uploadedFilesInfo = new ArrayList<Map<String, Object>>();
		  
		  String uploadDir = rootDir;
		  File uploadDirFile = new File(uploadDir);  
		  
	      if (!uploadDirFile.exists()) {  
	           uploadDirFile.mkdirs();  
	      }else{
	    	  FileDeleteUtil.deleteDir(uploadDirFile);
	    	  
	      }
	      
	      String fileName = null;  
	        int i = 0;  
	        for (Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet()  
	                .iterator(); it.hasNext(); i++) {  
	  
	            Map.Entry<String, MultipartFile> entry = it.next();  
	            MultipartFile mFile = entry.getValue();  
	  
	            fileName = mFile.getOriginalFilename();  
	  
	            String storeName = rename(fileName);  
	  
	            String noZipName = uploadDir + storeName;  
	            String zipName = zipName(noZipName);  
	  
	            // �ϴ���Ϊѹ���ļ�  
	            FileOutputStream OutputStream = new FileOutputStream(zipName);
	            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(OutputStream));  
	            zipOutputStream.putNextEntry(new ZipEntry(fileName));  
	            zipOutputStream.setEncoding("GBK"); 
	            
	  
	            FileCopyUtils.copy(mFile.getInputStream(), zipOutputStream);  
	            
	            zipOutputStream.close();
	            OutputStream.close();
	            
	            Map<String, Object> map = new HashMap<String, Object>();  
	            // �̶�����ֵ��  
	            map.put(FileUploadUtil.REALNAME, zipName(fileName));  
	            map.put(FileUploadUtil.STORENAME, zipName(storeName));  
	            map.put(FileUploadUtil.SIZE, new File(zipName).length());  
	            map.put(FileUploadUtil.SUFFIX, "zip");  
	            map.put(FileUploadUtil.CONTENTTYPE, "application/octet-stream");  
	            map.put(FileUploadUtil.CREATETIME, new Date());  
	 
	  
	            uploadedFilesInfo.add(map);  
	        }  
	      
		  return uploadedFilesInfo;
		  
	  }
	  
	  	/** 
	     * �����ϴ��ļ� 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * @param request 
	     * @param  identifying �ò���Ϊ��Ŀ¼�Ĵ�һ������Ŀ¼+����������
	     * 					��Ǹ���洢���ļ�Ϊ�����ļ���Ϊ��ҵ�����ļ�+��ҵid��
	     * 					�������֤���ļ�+�û�id����̳����ͼƬ�ļ�+�����û�id�ȣ�  
	     * @return uploadedFilesInfo
	     * @throws Exception 
	     */  
	   public static List<Map<String, Object>> upload(HttpServletRequest request,  
	            String[]  identifying) throws Exception {  
	  
	       
		   	
	        MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;  
	        Map<String, MultipartFile> fileMap = mRequest.getFileMap();  
	        
	        String uploadDir=request.getSession().getServletContext().getRealPath("/")+
	        				identifying[0]+"/"+ identifying[1]+"/"+ FileUploadUtil.UPLOADDIR;
	        List<Map<String, Object>> uploadedFilesInfo = storeFile(uploadDir, fileMap);  
	        Map<String ,Object> filesDir = new HashMap<String, Object>();
	        filesDir.put(ForderDir, uploadDir);
	        uploadedFilesInfo.add(filesDir);
	        return uploadedFilesInfo;  
	    }
	   
	   /** 
	     * �����ļ��ϴ��ļ�(��ѹ��) 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * 
	     * @param file     �ϴ����ļ��� MultipartFile����
	     * @param fileNum  ���û������μ����ϴ����ļ������� 
	     * @param request 
	     * @param  identifying �ò���Ϊ��Ŀ¼�Ĵ�һ������Ŀ¼+����������
	     * 					��Ǹ���洢���ļ�Ϊ�����ļ���Ϊ��ҵ�����ļ�+��ҵid��
	     * 					�������֤���ļ�+�û�id����̳����ͼƬ�ļ�+�����û�id�ȣ�  
	     * @return uploadedFilesInfo
	     * @throws Exception 
	     */  
	   	
	   public static Map<String,Object> upload(MultipartFile file ,int fileNum ,  String[]  identifying , HttpServletRequest request ){
		   
		   	String uploadDir=request.getSession().getServletContext().getRealPath("/")+
		   			identifying[0]+"/"+ identifying[1]+"/"+ FileUploadUtil.UPLOADDIR;
		   	
		   	
		  	String fileName = file.getOriginalFilename();
		  	String storeName = rename(fileName);  
			  
            String noZipName = uploadDir + storeName;  
           
            File targetFile = new File(noZipName); 
		   	if(!targetFile.exists()){  
	            targetFile.mkdirs();  
	        }else{
	        	if(targetFile.isDirectory()&&fileNum==targetFile.list().length){
	        		FileDeleteUtil.deleteDir(targetFile);
	        	}
	        }
		  	
			//����  
	        try {  
	            file.transferTo(targetFile);  
	        } catch (IOException e) {  
	            throw new SystemException(e); 
	        }  
	        Map<String, Object> map = new HashMap<String, Object>();  
            // �̶�����ֵ��  
            map.put(FileUploadUtil.REALNAME, fileName);  
            map.put(FileUploadUtil.STORENAME, storeName);  
            map.put(FileUploadUtil.SIZE, targetFile.length());  
            map.put(FileUploadUtil.SUFFIX, fileName.substring(fileName.lastIndexOf(".")));  
            map.put(FileUploadUtil.CONTENTTYPE, "application/octet-stream");  
            map.put(FileUploadUtil.CREATETIME, new Date());
            map.put(FileUploadUtil.ForderDir, uploadDir);
	       
            return map;
	   }
}
