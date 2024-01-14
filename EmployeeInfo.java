import java.sql.*;
import java.io.*;

class EmployeeInfo
{
	public static void main(String args[])
	{
		try
		{
			//1.Loading the jdbc odbc Driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("\n Drivers are Loaded Successfully");

		//2.Creating connection to database
		Connection con=DriverManager.getConnection("Jdbc:Odbc:data");
		System.out.println("\n Connection Established");

		int no=Integer.parseInt(args[0]);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp where no="+no);
		System.out.println("\n Name \t Empno  \t   Salary");

		while(rs.next())
		{
			System.out.println(" "+rs.getString(1)+"\t" +rs.getInt(2)+"\t\t" + rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
		
		System.out.println("\n Connection is Closed");
	}
	catch(SQLException e)
	{
		System.out.println("\n SQL ERROR");
	}
	catch(Exception e)
	{
		System.out.println("ERROR");
	}
 }
}
