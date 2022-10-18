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
		String query = "update student2 SET studentName='Aniket' where studentId=2";
		int i = st.executeUpdate(query);
		String query2 = "delete from student2 where studentId=2";
		int j = st.executeUpdate(query2);
		//boolean t = st.execute("insert into student2 value(2, 'Roshan' ,20 )");
		System.out.println(" Updated"+i);
		System.out.println("Delete executed"+j);
		//System.out.println("Row inserted successfully");
		st.close();
		con.close();
		

	}

}
