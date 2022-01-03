package PostGresqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPostGresqlConnection {
		
	//jdbc url
		//jdbc username
		//jdbc password
		private final String url="jdbc:postgresql://localhost/Practice";
		private final String user="postgres";
		private final String password ="0408";
		
		//Connection done- I will create a method to communication
		private void connect() {
			//Whether we deal with the server we always go for exception handling
			//Server may active, busy, not responsive......
			try {
				//I would like check if the connectionEstablish or not from the postGreSql....
				Connection connection= DriverManager.getConnection(url,user,password);
			    if(connection!=null) {
			    	System.out.println("Connected to postgresql server Successfully");
			    }else {
			    	System.out.println("Connection failed...........");
			    }
			    Statement statement=connection.createStatement();
			    //ResultSet resultset=statement.executeQuery("Select * from example");
			    ResultSet resultset=statement.executeQuery("Select * from example");
			    if(resultset.next()) {
			    	System.out.println(resultset.getString(1)+" "+resultset.getInt(2));
			    }
			    if(resultset.next()) {
			    	System.out.println(resultset.getString(1)+" "+resultset.getInt(2));
			    }
			    
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			JDBCPostGresqlConnection sqlconnection=new JDBCPostGresqlConnection();
			sqlconnection.connect();
		}

	}
