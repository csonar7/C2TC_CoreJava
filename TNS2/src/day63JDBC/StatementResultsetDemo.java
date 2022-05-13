package day63JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementResultsetDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Chetan@1234567");
			Statement st=con.createStatement();
			String query = "select * from student";
			ResultSet rs=st.executeQuery(query);
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd);
			int cols=rsmd.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=cols;i++)
				{
					System.out.println(rs.getString(cols));
				}
				System.out.println("");
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
