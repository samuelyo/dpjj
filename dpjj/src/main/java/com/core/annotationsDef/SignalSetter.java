package main.java.com.core.annotationsDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jimmy-james
 *  ��ע�����ڱ��model�����ݿ��֮��Ķ�Ӧ��ϵ
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)
public @interface SignalSetter {
	String column();   //˵������Ӧ���ֶ�
}
