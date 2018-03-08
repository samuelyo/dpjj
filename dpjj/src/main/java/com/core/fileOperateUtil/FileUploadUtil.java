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
	     * 将上传的文件进行重命名 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20  
	     * @param name (有扩展名的)
	     * @return 
	     */  
	 public static String rename(String name) {  
	  
	     	Long now = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmss")  
	                .format(new Date()));  
	        Long random = (long) (Math.random() * now);  
	        String fileName = now + "" + random;  
	  
	        if (name.indexOf(".") != -1) {  
	            fileName += name.substring(name.lastIndexOf("."));  //加上扩展名
	        }  
	  
	        return fileName;  
	 }  
	 
	    /** 
	     * 压缩后的文件名 
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
	     * 将压缩文件 
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
	     * 将压缩文件 
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
	  
	            // 上传成为压缩文件  
	            FileOutputStream OutputStream = new FileOutputStream(zipName);
	            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(OutputStream));  
	            zipOutputStream.putNextEntry(new ZipEntry(fileName));  
	            zipOutputStream.setEncoding("GBK"); 
	            
	  
	            FileCopyUtils.copy(mFile.getInputStream(), zipOutputStream);  
	            
	            zipOutputStream.close();
	            OutputStream.close();
	            
	            Map<String, Object> map = new HashMap<String, Object>();  
	            // 固定参数值对  
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
	     * 批量上传文件 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * @param request 
	     * @param  identifying 该参数为根目录的次一级分类目录+所有者名，
	     * 					标记该需存储的文件为哪类文件（为企业资质文件+企业id、
	     * 					个人身份证明文件+用户id、论坛贴文图片文件+发帖用户id等）  
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
	     * 单个文件上传文件(非压缩) 
	     *  
	     * @author jamesY 
	     * @date 2016-10-20 
	     * 
	     * @param file     上传的文件的 MultipartFile对象
	     * @param fileNum  该用户该批次即将上传的文件总数量 
	     * @param request 
	     * @param  identifying 该参数为根目录的次一级分类目录+所有者名，
	     * 					标记该需存储的文件为哪类文件（为企业资质文件+企业id、
	     * 					个人身份证明文件+用户id、论坛贴文图片文件+发帖用户id等）  
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
		  	
			//保存  
	        try {  
	            file.transferTo(targetFile);  
	        } catch (IOException e) {  
	            throw new SystemException(e); 
	        }  
	        Map<String, Object> map = new HashMap<String, Object>();  
            // 固定参数值对  
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
