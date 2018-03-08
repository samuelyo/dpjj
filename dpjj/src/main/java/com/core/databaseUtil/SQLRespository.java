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
	 * @param condition  ��Ϊsql�����where�Ӿ��е�����
	 * 					����  ��where id = 001���������condition��ָ
	 * 					��id = 001��  
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
	 * @param condition  ��Ϊsql�����where�Ӿ��е�����
	 * 					����  ��where id = 001���������condition��ָ
	 * 					��id = 001��
	 * @param orderColum Ϊorder by ������ֶ���
	 * @param limit		Ϊlimit��ߵ�������������ɵ��ַ���
	 * 					���磺limit 1��3 ��ָ���ذ�����2����¼��˳��3����¼��
	 * 					����¼2��3��4��������ָ��limit���ǡ�1��3��
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
