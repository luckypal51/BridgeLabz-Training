package jdbc.BankTransaction;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
	  private final String url = "jdbc:mysql://localhost:3306/practicedb";
	  private final String userName = "root";
	  private final String password = "051203";
      private Connection connection;
      private static SQLConnection instance;
      
      private SQLConnection() {
    	  try {
    		  connection = DriverManager.getConnection(url,userName,password);
    	  }catch(Exception  e) {
    		  System.out.println("Connection Failed");
    	  }
      }
      
      public static SQLConnection getInstance() throws Exception{
    	  if(instance==null||SQLConnection.getInstance().getConnection().isClosed()) {
    		  instance = new SQLConnection();
    	  }
    	  return instance;
      }
      
      public Connection getConnection() {
    	  return connection;
      }
}
