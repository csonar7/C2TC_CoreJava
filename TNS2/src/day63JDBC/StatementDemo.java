package day63JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StatementDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tns";
			Properties p=new Properties();
			p.put("user", "root");
			p.put("password", "Chetan@1234567");
			Connection con = DriverManager.getConnection(url, p);
			Statement s=con.createStatement();
			String query1="Create table Students(StudentId int primary key, StudentName varchar(20), StudentMarkes double)";
			int i=s.executeUpdate(query1);
			System.out.println("No of rows Affected: "+i);
			System.out.println("Table Created Successfully");
			s.close();
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
