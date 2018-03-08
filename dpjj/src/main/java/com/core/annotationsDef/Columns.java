package main.java.com.core.annotationsDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jimmy-james
 * 该注解用于标记model的属性与数据库字段的对应关系
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.FIELD) 
public @interface Columns
{
	
	String column();  //数据库对应字段 
	String describe() default "";  //字段描述
}
