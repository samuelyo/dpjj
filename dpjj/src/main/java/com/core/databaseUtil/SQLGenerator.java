package main.java.com.core.databaseUtil;



import java.sql.SQLDataException;
import java.sql.SQLException;

import main.java.com.core.annoProcessTools.ProcessorModelToSQL;
import main.java.com.core.exception.BusinessException;
import main.java.com.core.exception.SystemException;

public class SQLGenerator {
	public static final String INSERT = "insert";
	public static final String SELECT = "select";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";
	
	ProcessorModelToSQL pocessor = new ProcessorModelToSQL();
	
	public String insertSql(Class model){
		
		String sql;
		sql = pocessor.insertSql(model);
		return sql;
	}
	
	/**
	 * @editor jamesY
	 * @param model
	 * @param condition 如果没有条件，请填null
	 * @param orderColum 如果没有条件，请填null
	 * @param limit  形如：0，2     指第一条到第二条记录，如果没有条件，请填null
	 * @return sqlbuf  sql语句
	 */
	public String selectHeaderSql(Class model ){
		
		String sql="";
		sql += pocessor.selectHeaderSql(model);
		return sql;
	}
	
	
	
	/**
	 * @editor jamesY
	 * @param model
	 * @param condition  不能为空
	 * @return
	 * @throws SQLException 
	 */
	public String deleteHeaderSql(Class model) {
		
		String sql = "";
		sql += pocessor.deleteHeaderSql(model);
		
		return sql;
	}
}
