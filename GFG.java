import java.io.*;
import java.sql.*;
 
class GFG {
    public static void main(String[] args) throws Exception
    {
        String url
            = "jdbc:mysql://127.0.0.1:3306/employee"; // table details
        String username = "root"; // MySQL credentials
        String password = "";
        String query
            = "select * from Orders"; // query to be run
        Class.forName(
            "com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
            url, username, password);
        System.out.println(
            "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
            = st.executeQuery(query); // Execute query
        rs.next();
        String name
            = rs.getString("OrderID"); // Retrieve name from db
 
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}