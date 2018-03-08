package main.java.com.core.annotationsDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jimmy-james
 *  该注解用于标记model与数据库表之间的对应关系
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)
public @interface SignalSetter {
	String column();   //说明所对应的字段
}
