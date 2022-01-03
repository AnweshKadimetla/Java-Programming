package PostGresqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeJDBCPostGresqlConnection {
	
		private String url="jdbc:postgresql://localhost/Practice";
		private String username="postgres";
		private String password="0408";
		private void connect() {
			try {
				//whenever deel with server we go for Excetion Handling
				Connection connection=DriverManager.getConnection(url, username, password);
				//The connction estableshed or not from postgresql
				if(connection!=null) {
					System.out.println("Connction established successfully");
				}
				else {
					System.out.println("Connection failed");
				}
				
				Statement statement=connection.createStatement();
				//ResultSet resultset=statement.executeQuery("insert into checks values('sai',23,4)");
				/*if(resultset.next()) {
					System.out.println(resultset.getString(1)+" "+resultset.getInt(2)+" "+resultset.getInt(3));
				}
				if(resultset.next()) {
					System.out.println(resultset.getString(1)+" "+resultset.getInt(2)+" "+resultset.getInt(3));
				}
				if(resultset.next()) {
					System.out.println(resultset.getString(1)+" "+resultset.getInt(2)+" "+resultset.getInt(3));
				}
				*/
				System.out.println("**************************************************************************************");
				ResultSet resultset1=statement.executeQuery("select * from checks");
				if(resultset1.next()) {
					System.out.println(resultset1.getString(1)+" "+resultset1.getInt(2)+" "+resultset1.getInt(3));
				}
				if(resultset1.next()) {
					System.out.println(resultset1.getString(1)+" "+resultset1.getInt(2)+" "+resultset1.getInt(3));
				}
				if(resultset1.next()) {
					System.out.println(resultset1.getString(1)+" "+resultset1.getInt(2)+" "+resultset1.getInt(3));
				}
				if(resultset1.next()) {
					System.out.println(resultset1.getString(1)+" "+resultset1.getInt(2)+" "+resultset1.getInt(3));
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		PracticeJDBCPostGresqlConnection jd=new PracticeJDBCPostGresqlConnection();
		jd.connect();

	}

}
