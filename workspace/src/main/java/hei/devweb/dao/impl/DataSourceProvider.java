package hei.devweb.dao.impl;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {
	
	private static MysqlDataSource dataSource;

	public static MysqlDataSource getDataSource() {
		if (dataSource==null){
			dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("ineedaride");
			dataSource.setUser("root");
			dataSource.setPassword("");
		}
		return dataSource;
	}

	public static void setDataSource(MysqlDataSource dataSource) {
		DataSourceProvider.dataSource = dataSource;
	}
	
}
