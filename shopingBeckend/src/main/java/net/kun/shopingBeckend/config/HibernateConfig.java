package net.kun.shopingBeckend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="net.kun.shopingBeckend.dto")
@EnableTransactionManagement
public class HibernateConfig {
	
	
	
	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
	private final static String DATABASE_DRIVER="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";

	// DataSource will be avilable
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource  datasource= new BasicDataSource();
		datasource.setDriverClassName(DATABASE_DRIVER);
		datasource.setUrl(DATABASE_URL);
		datasource.setUsername(DATABASE_USERNAME);
		datasource.setPassword(DATABASE_PASSWORD);
		
		return datasource;
	}
		
		
	
	
	// Sassionfacrory will be avilable
	@Bean
	public  SessionFactory getSessionFactory(DataSource datasorce)
	{
	
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(datasorce);
		builder.addProperties(getHerbernateProperties());
		builder.scanPackages("net.kun.shopingBeckend.dto");
		return builder.buildSessionFactory();
	}
	
	
	// all the hibernate propertis wil be avilable

	@Bean
	public Properties getHerbernateProperties()
	{
		Properties properties =new Properties();
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		
		properties.put("hiberner.show_sql","true");
		
		properties.put("hiberner.format_sql","true");

		return properties;
	}
		
	// TransectionManager bean
	@Bean
	public    HibernateTransactionManager getTransectionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transectionManager=new HibernateTransactionManager(sessionFactory);
		
	   return transectionManager;
		
	}


}