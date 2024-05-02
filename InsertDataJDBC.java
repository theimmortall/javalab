import java.sql.*;
class InsertDataJDBC
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","");
		Statement stmt = con.createStatement();
		int norows = stmt.executeUpdate("Insert into Persons values(9,'singh','rajesh','asd','ggg')");
        System.out.println("No of rows affected = "+norows);
		con.close();
	}
}
