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
@Target(ElementType.TYPE) 
public @interface DbInfo
{
	String url() default "";  //数据库地址
	String un() default "";  //数据库连接用户名
	String pw() default "";  //数据库连接密码
	String tableName();  //model对应数据表
}
