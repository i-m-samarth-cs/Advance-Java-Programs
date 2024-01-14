import java.sql.*;
class ConnectTest2
{
   public static void main(String args[])
   {
	  try
	  {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("\n Drivers are Properly loaded");

	    String url="JDBC:ODBC:data";
		Connection con=DriverManager.getConnection(url);
	
		System.out.println("\n Connection Established");
		con.close();
     }
     catch(SQLException e)
	 {
		System.out.println("\n SQL Error has occured");
     }
     catch(Exception e)
     {
		System.out.println("\n Error Connection not Establised");
     }
  }
}