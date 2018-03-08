package main.java.com.core.databaseUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.SignalSetter;

import org.springframework.beans.factory.annotation.Autowired;

public class JdbcUtil {
	@Autowired
	private static DataSource dataSource;
	/**
	 * @param sql 带占位符（？）的sql
	 * @param args 占位符所代表的字段值
	 * @return
	 */
	public static ResultSet getConn(String sql,String[] args){
		
		ResultSet rs = null;
		PreparedStatement ps ;
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			for(int index=1;index<=args.length;index++){
				ps.setString(index, args[index-1]);
			}
			rs = ps.executeQuery();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
		return rs;
		
	}
	
	/**
	 * @param t 实体对象的Class对象
	 * @param rs 数据库返回的结果集
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws SQLException
	 */
	public static<T> T getEntity(Class<T> t,ResultSet rs) 
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SQLException{
		
		T entity = t.newInstance();
		Field[] fields = t.getFields();
		Map<String , Method> setterMapper = new HashMap<String , Method>();
		Method[] methods = t.getMethods();
		for(Method m : methods){
			Annotation[] aArray=m.getAnnotations();
			for(Annotation one:aArray) {
				if(one instanceof SignalSetter)  {  
					String columName=((SignalSetter)one).column();
					setterMapper.put(columName, m);
		        }  
			}
		}
		
		for(Field f : fields){
			Annotation[] aArray=f.getAnnotations();
			Class<?> columType = f.getType();
			String columName = null ;
			Method setter = null ;
			for(Annotation one:aArray) {
				if(one instanceof Columns)  {  
					columName=((Columns)one).column();
					setter=(Method)setterMapper.get(columName);
					break;
		        }  
			}
			setter.invoke(entity, rs.getObject(columName, columType));
		}
		
		return entity;
	}
	
}
