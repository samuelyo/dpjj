package main.java.com.core.log.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import main.java.com.core.log.model.Log;

public class LogService {

	/**
	 * @param log
	 * 将log加入数据库
	 */
	public void add(Log log) {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @param log
	 * @param request
	 * 
	 * 将log转换成String存入web应用的本地log文件中
	 * @throws IOException 
	 */
	public void add(Log log, HttpServletRequest request) throws IOException {
		// TODO Auto-generated method stub
		
		String logdir = "";
		String appdir =  request.getSession().getServletContext().getRealPath("/");
		File appfile = new File(appdir);
		if(appfile.isDirectory()){
			logdir += appfile.getParent()+"/log.txt";
		}
		File logfile = new File(logdir);
		if(!logfile.exists()){
			logfile.mkdirs();
		}
		String logRecord = log.toString();
		 FileWriter writer;
	     try {
	            writer = new FileWriter("logdir");
	            writer.write(logRecord);
	            writer.flush();
	            writer.close();
	     } catch (IOException e) {
	            e.printStackTrace();
	     }
	}

}
