package JDBCDEMO;

import java.sql.*;

public class JdbcDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

     // 2.  Creating a connection
        String username ="root";
        String password ="root";
        String url = "jdbc:mysql://localhost:3306/730batch";
        Connection con = DriverManager.getConnection(url,username,password);

        // 3. Creating a statement
        Statement st = con.createStatement();

      // 4. Executing the query

        // DDL Queries - Data Definition language

        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t\t");
            System.out.print(rs.getString("name")+"\t\t");
            System.out.print(rs.getString("branch")+"\t\t");
            System.out.println(rs.getInt("marks"));
        }

    }
}
