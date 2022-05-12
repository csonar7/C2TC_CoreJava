package day63JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class St {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Chetan@1234567");
				Statement st =con.createStatement();
				String s = "create table student4 (studentId int primary key, studentName varchar(45), stuentMarks int )";
				int i = st.executeUpdate(s);
				boolean t = st.execute("create table student3 (studentId int primary key, studentName varchar(45), stuentMarks int )");
				System.out.println("no of rows affected"+i);
				System.out.println("query executed"+t);
				System.out.println("Table created successfully");
				st.close();
				con.close();
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}

}


