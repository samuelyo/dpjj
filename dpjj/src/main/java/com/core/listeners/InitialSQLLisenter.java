package main.java.com.core.listeners;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.core.databaseUtil.SQLGenerator;
import main.java.com.core.databaseUtil.SQLRespository;
import main.java.com.core.gainClassInfoUtil.GainClassObjectsUtil;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class InitialSQLLisenter implements
		ApplicationListener<ContextRefreshedEvent> {
	
	private SQLGenerator generator = new SQLGenerator();
	private GainClassObjectsUtil classListUtil = new GainClassObjectsUtil();
	
	private static boolean haveSQLs = false;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		 Map<String ,String> insertSqlMap = new HashMap<String ,String>();
		 Map<String ,String> deleteSqlMap = new HashMap<String ,String>();
		 Map<String ,String> selectSqlMap = new HashMap<String ,String>();
		// TODO Auto-generated method stub
		if(arg0.getApplicationContext().getParent() != null){//root application context ��parent,��˵��webӦ�ü������Ļ����Ѿ������꣬��spring������ʼ����ɺ�ͻ�ִ�и÷���
			
			
			System.out.println("===================��ʼ����SQL���=====================");
			if(haveSQLs){
				return ;
			}
			List<Class> classes =classListUtil.getAllClassByPackage("main.java.com.core.model");
			/*if(null!=classes){
				System.out.println("==================================================================");
				for(Class clazz : classes){
					System.out.println(clazz+"=============\r\n");
				}
				System.out.println("==================================================================");
			}else{
				System.out.println("=======classes is null!=======");
			}*/
			for(Class model : classes){
				insertSqlMap.put(model.getName(), generator.insertSql(model));
				deleteSqlMap.put(model.getName(), generator.deleteHeaderSql(model));
				selectSqlMap.put(model.getName(), generator.selectHeaderSql(model));
			}
			
			for(Map.Entry<String, String> entry : insertSqlMap.entrySet()){
				System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
			}
			System.out.println("==================================================================");
			for(Map.Entry<String, String> entry : deleteSqlMap.entrySet()){
				System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
			}
			System.out.println("==================================================================");
			for(Map.Entry<String, String> entry : selectSqlMap.entrySet()){
				System.out.println(entry.getKey()+"  :  "+entry.getValue()+"\r\n");
			}
			System.out.println("===================��������SQL���=====================");
			System.out.println("===================��ʼ�洢SQL���=====================");
			SQLRespository.setDeleteSqlMap(deleteSqlMap);
			SQLRespository.setInsertSqlMap(insertSqlMap);
			SQLRespository.setSelectSqlMap(selectSqlMap);
			System.out.println("===================�����洢SQL���=====================");
			
		}
	}

}
