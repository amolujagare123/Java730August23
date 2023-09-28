package JDBCDEMO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

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

        String sql = "insert into student values (7,'revathy','comp',99)";
        st.executeUpdate(sql);

    }
}
