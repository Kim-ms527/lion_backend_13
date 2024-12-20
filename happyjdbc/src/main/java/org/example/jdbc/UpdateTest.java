package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/scott";
        String user = "like";
        String password = "lion";
        String sql = "update dept set dname=? where deptno = ?";

        //try-with-resources
        try(
                Connection conn = DriverManager.getConnection(url,user,password);
                PreparedStatement ps = conn.prepareStatement(sql);
                ){
            ps.setString(1,"test");
            ps.setInt(2,80);

            int count = ps.executeUpdate();

            System.out.println(count +"건 수정했어요^^");
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
