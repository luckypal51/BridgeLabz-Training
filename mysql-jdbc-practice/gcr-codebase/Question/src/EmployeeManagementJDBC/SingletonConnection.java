package EmployeeManagementJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static SingletonConnection singletonConnection;
	private Connection connection;
    private static final String location = "jdbc:mysql://localhost:3306/practicedb";
    private static final String user = "root";
    private static final String password = "051203";
    
    private SingletonConnection() throws SQLException{
    	try {
//    		Class.forName("com.mysql.cj.jdbc.Driver");
    		this.connection = DriverManager.getConnection(location, user, password);
    	}catch(Exception e) {
    		throw new SQLException("Driver Not Found ");
    	}
    }
    
    public static SingletonConnection getInstance() throws Exception{
    	if(singletonConnection==null||singletonConnection.getConnection().isClosed()) {
    		singletonConnection = new SingletonConnection();
    	}
    	return singletonConnection;
    }
    public Connection getConnection() {
    	return connection;
    }
    
}
