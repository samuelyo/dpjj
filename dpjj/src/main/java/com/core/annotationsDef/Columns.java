package main.java.com.core.annotationsDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jimmy-james
 * ��ע�����ڱ��model�����������ݿ��ֶεĶ�Ӧ��ϵ
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.FIELD) 
public @interface Columns
{
	
	String column();  //���ݿ��Ӧ�ֶ� 
	String describe() default "";  //�ֶ�����
}
