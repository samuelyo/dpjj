package test;

import java.util.List;

import main.java.com.core.annoProcessTools.ProcessorModelToSQL;
import main.java.com.core.model.Admin;
import junit.framework.TestCase;

public class ProcessorModelToSqlTest extends TestCase {
	public void test(){
		ProcessorModelToSQL processor = new ProcessorModelToSQL();
		String sql = processor.insertSql(Admin.class);
		System.out.println("===="+sql+"=====");
	}
}
