package main.java.com.core.commonUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	
	
	/**
	 * @author jamesY
	 * @since 2016-10-27
	 * @return String currentDate
	 */
	public static String getCurrentDate() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Date date = new Date();
		return df.format(date);
	}

}
