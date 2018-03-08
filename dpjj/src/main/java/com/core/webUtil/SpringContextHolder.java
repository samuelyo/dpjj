package main.java.com.core.webUtil;

import javax.servlet.ServletConfig;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import main.java.com.core.log.model.Log;



public class SpringContextHolder implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	 
	
	/** 
     * 此方法可以把ApplicationContext对象inject到当前类中作为一个静态成员变量。 
     * @param applicationContext ApplicationContext 对象. 
     * @throws BeansException 
     */  
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		SpringContextHolder.applicationContext=arg0;
	}
	
	public static ApplicationContext getApplicationContext() {
         return applicationContext;
	}
	
	@SuppressWarnings("unchecked")
    public static <T> T getBean(String name) throws BeansException {
               return (T) applicationContext.getBean(name);
    }
	
}
