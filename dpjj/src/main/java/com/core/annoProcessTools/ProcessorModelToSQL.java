package main.java.com.core.annoProcessTools;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;



/**
 * @author jimmy-james
 *
 */

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes({"DbInfo","columns"})
public class ProcessorModelToSQL {
	
	public static final String INSERT = "insert";
	public static final String SELECT = "select";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";
	
	
	public String insertSql(Class model){
		
		Annotation type = model.getAnnotation(DbInfo.class);		
		String tableName=((DbInfo)type).tableName();  
		//System.out.println("========"+tableName+"========");
		String sqlbuf = "";
		String colums = "";
		Field[] fields = model.getDeclaredFields();
	
		int i = 0;
		for(Field f : fields){
			i++;
			Annotation[] aArray=f.getAnnotations();
			for(Annotation one:aArray) {
				if(one instanceof Columns)  {  
					String columName=((Columns)one).column();
					colums+=columName;
					if(i<fields.length) colums+=",";
		        }  
			}
		}
		sqlbuf += ProcessorModelToSQL.INSERT+" into "+tableName+"("+colums +") values (";
		for(;i>0;i--){
			sqlbuf +="?";
			if(i>1) sqlbuf +=",";
		}
		sqlbuf +=")";
		i=0;
		
		
		return sqlbuf;
	}
	
	
	
	/**
	 * @editor jamesY
	 * @param model
	 * @param condition ���û������������null
	 * @param orderColum ���û������������null
	 * @param limit  ���磺0��2     ָ��һ�����ڶ�����¼�����û������������null
	 * @return sqlbuf  sql���
	 */
	public String selectHeaderSql(Class model){
		
		Annotation type = model.getAnnotation(DbInfo.class);		
		String tableName=((DbInfo)type).tableName();  
		String sqlbuf = ProcessorModelToSQL.SELECT+" * from "+tableName+" ";
		
		
		return sqlbuf;
	}
	
	
	
	public String deleteHeaderSql(Class model){
		
		Annotation type = model.getAnnotation(DbInfo.class);		
		String tableName=((DbInfo)type).tableName(); 
		
		String sqlbuf = "";
		sqlbuf += ProcessorModelToSQL.DELETE+" from "+tableName+" ";
		
		return sqlbuf;
	}
}
