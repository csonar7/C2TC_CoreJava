package day63JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudPreparedStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Chetan@1234567");
			pt= con.prepareStatement("insert into student values(?,?,?)");
			pt.setInt(1, 3);
			pt.setString(2, "Chetan");
			pt.setInt(3, 300);
			int i = pt.executeUpdate();
			System.out.println("no.of rows affected:"+i);
			System.out.println("rows insterted successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {}
		try {
			if(pt!=null);
			pt.close();
			pt=null;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	

	}

}
