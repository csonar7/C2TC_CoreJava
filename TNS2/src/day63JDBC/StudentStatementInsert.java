package day63JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/tns";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","Chetan@1234567");
		Connection con= DriverManager.getConnection(url,p);
		Statement st = con.createStatement();
		String query = "insert into student value(1, 'Aniket' ,20.25 )";
		int i = st.executeUpdate(query);
		boolean t = st.execute("insert into student value(2, 'Roshan' ,20 )");
		System.out.println("no of rows affected"+i);
		System.out.println("query executed"+t);
		System.out.println("Row inserted successfully");
		st.close();
		con.close();
		

	}

}
