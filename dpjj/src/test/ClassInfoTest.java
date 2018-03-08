package test;

import java.util.List;

import main.java.com.core.gainClassInfoUtil.GainClassObjectsUtil;
import junit.framework.TestCase;

public class ClassInfoTest extends TestCase {
	
	GainClassObjectsUtil classUtil = new GainClassObjectsUtil();
	
	
	public void test(){
		List<Class> classes = classUtil.getAllClassByPackage("main.java.com.core.model");
		if(null!=classes){
			System.out.println("==================================================================");
			for(Class clazz : classes){
				System.out.println(clazz+"=============\r\n");
			}
			System.out.println("==================================================================");
		}else{
			System.out.println("=======classes is null!=======");
		}
	}
}
