package com.lti.casestudy.day4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	public static void main(String [] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String user ="hr";
			String pass ="12";
			
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful....");
			//inserting query
			//1.statement
			//2.prepares statement
			Statement st = conn.createStatement();
			st.execute("INSERT INTO StudentClass VALUES(1,'JOHN','1-JUN-1995')");
		}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				}
				catch(Exception e) { }
			}
				
				
	}
}
