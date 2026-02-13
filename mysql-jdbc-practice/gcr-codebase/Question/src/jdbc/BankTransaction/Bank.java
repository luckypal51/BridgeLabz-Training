package jdbc.BankTransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bank implements BankDao{
	private Connection connection;
	public Bank() {
		try {
			connection = SQLConnection.getInstance().getConnection();
			System.out.println("Welcome To Lucky Bank");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	@Override
	public void addAccount(Account a) {
	    String query = "INSERT INTO bank VALUES(?,?,?)";
	    try {
	    	PreparedStatement per = connection.prepareStatement(query);
	    	per.setInt(1,a.getAccountNo());
	    	per.setString(2,a.getName());
	    	per.setDouble(3,a.getBalance());
	    	int row = per.executeUpdate();
	    	System.out.println("Account Successfully created ");
	    }catch(Exception e) {
	    	System.out.println("Failed To Open Account"+e.getMessage());
	    }
	    
	}

	@Override
	public Account getAccount(int accountNo) {
		String query = "Select * from bank where accountNo = ?";
		Account a = new Account();
		try {
			PreparedStatement per = connection.prepareStatement(query);
			per.setInt(1, accountNo);
		    ResultSet re = per.executeQuery();
		   while(re.next()) {
			   a.setAccountNo(re.getInt(1));
			    a.setName(re.getString(2));
			    a.setBalance(re.getDouble(3));
		   }
		    return a;
		}catch(Exception e) {
			System.out.println("Failed To Fetch Details ");
		}
		return null;
	}

	@Override
	public void addAmount(int accountNo,double amount) {
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		String query = "Update bank set balance = balance + ? where accountNo = ?";
		try {
			PreparedStatement per = connection.prepareStatement(query);
			per.setDouble(1, amount);
			per.setInt(2, accountNo);
			int row = per.executeUpdate();
			connection.commit();
			System.out.println("Amount added Successfully");
		}catch(Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e.getMessage());
			}
		}
		try {
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void withdrawal(int accountNo,double amount) {
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		String query = "Update bank set balance = balance - ? where accountNo = ?";
		try {
			PreparedStatement per = connection.prepareStatement(query);
			per.setDouble(1, amount);
			per.setInt(2, accountNo);
			int row = per.executeUpdate();
			connection.commit();
			System.out.println("Amount withdrawal Successfully");
		}catch(Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e.getMessage());
			}
		}
		try {
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void transferAmount(int sender, int reciver, double amount) {
			try {
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			String send = "Update bank set balance = balance - ? where accountNo = ?";
			String recive = "Update bank set balance = balance + ? where accountNo = ?";
		try {
			PreparedStatement sen = connection.prepareStatement(send);
		    sen.setDouble(1, amount);
		    sen.setInt(2, sender);
		   
		    PreparedStatement rev = connection.prepareStatement(recive);
		    rev.setDouble(1,amount);
		    rev.setInt(2,reciver);
		    int row2 = rev.executeUpdate();
		    int row = sen.executeUpdate();
		    connection.commit();
		}catch(Exception e) {
			try {
				connection.rollback();
			}catch(Exception s) {
				System.out.println(s.getMessage());
			}
			System.out.println(e.getMessage());
		}
		try {
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
