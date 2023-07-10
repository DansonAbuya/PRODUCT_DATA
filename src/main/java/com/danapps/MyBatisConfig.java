package com.danapps;
import java.io.IOException;
import java.io.Reader;

import javax.servlet.ServletContextEvent;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	static SqlSessionFactory sqlSessionFactory;
	
 static {
	 Reader reader;
	 
	 try {
		reader = Resources.getResourceAsReader("MyBatisConfig.xml");
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }

 public static SqlSessionFactory returnsessionFactory() {
	 return sqlSessionFactory;
 
}
	


}
