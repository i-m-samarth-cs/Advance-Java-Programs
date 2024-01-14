import java.sql.*;
import java.io.*;
import java.util.*;

class InsertData
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
		
		//3.Connection Established
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String names=s.next();

		System.out.println("Enter Employee No:");
		int no=s.nextInt();

		System.out.println("Enter Employee Salary:");
		String sal=s.next();

		//4.Insert Query
		String sqlQuery="INSERT into emp(name,no,salary)VALUES(?,?,?)";
		PreparedStatement pstmt2=con.prepareStatement(sqlQuery);

		pstmt2.setString(1,names);
		pstmt2.setInt(2,no);		//(col_no,value)
		pstmt2.setString(3,sal);

		//5.Updates the database
		pstmt2.executeUpdate();
		System.out.println("\n Employee Information Inserted Successsfully");

		//6.Closing connection
		pstmt2.close();
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
	