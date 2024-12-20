package org.example.jdbc;

import java.sql.*;

public class DBUtil {
    //접속
    public static Connection getConnection() throws Exception{
        String url= "jdbc:mysql://localhost:3306/scott";
        String user = "like";
        String password = "lion";

        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }

    public static Connection getConnection(String user,String password) throws Exception{
        String url= "jdbc:mysql://localhost:3306/scott";
//        String user = "like";
//        String password = "lion";

        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }

    //close
    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static  void close(Connection conn, PreparedStatement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn);
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn,ps);
    }
}
