package main.java.com.core.databaseUtil;

import java.util.HashMap;
import java.util.Map;

public class SQLRespository {
	private static Map<String , String> insertSqlMap ;
	private static Map<String , String> deleteSqlMap ;
	private static Map<String , String> selectSqlMap ;
	
	
	
	
	public static String getInsertSqlMap(Class model) {
		String sql = "";
		sql+=insertSqlMap.get(model.getName());
		return sql;
	}

	public static void setInsertSqlMap(Map<String, String> insertSqlMap) {
		SQLRespository.insertSqlMap = insertSqlMap;
		for(Map.Entry<String, String> entry : SQLRespository.insertSqlMap.entrySet()){
			System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
		}
	}

	
	/**
	 * @param model
	 * @param condition  即为sql语句中where子句中的条件
	 * 					例如  “where id = 001”，这里的condition即指
	 * 					“id = 001”  
	 * @return
	 */
	public static String getDeleteSqlMap(Class model ,String condition) {
		String sql = "";
		sql+=deleteSqlMap.get(model.getName());

		sql +=" where "+condition;
		
		return sql;
	}

	public static void setDeleteSqlMap(Map<String, String> deleteSqlMap) {
		SQLRespository.deleteSqlMap = deleteSqlMap;
		for(Map.Entry<String, String> entry : deleteSqlMap.entrySet()){
			System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
		}
	}

	/**
	 * @param model
	 * @param condition  即为sql语句中where子句中的条件
	 * 					例如  “where id = 001”，这里的condition即指
	 * 					“id = 001”
	 * @param orderColum 为order by 后面的字段名
	 * @param limit		为limit后边的两个数字所组成的字符串
	 * 					例如：limit 1，3 即指返回包含第2条记录的顺序3条记录，
	 * 					即记录2、3、4，这里所指的limit即是“1，3”
	 * @return
	 */
	public static String getSelectSqlMap(Class model, String condition , String orderColum, String limit) {
		String sql = "";
		sql+=selectSqlMap.get(model.getName());
		
		sql +=" where "+condition;
		
		if(null!=orderColum){
			sql +=" order by "+orderColum;
		}
		if(null!=limit){
			sql +=" limit "+limit;
		}
		return sql;
	}

	public static void setSelectSqlMap(Map<String, String> selectSqlMap) {
		SQLRespository.selectSqlMap = selectSqlMap;
		for(Map.Entry<String, String> entry : selectSqlMap.entrySet()){
			System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
		}
	}
	
}
