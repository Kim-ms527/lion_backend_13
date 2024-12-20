package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/scott";
        String user = "like";
        String password = "lion";
        String sql = "delete from dept where deptno=?";

        try(
                //1.접속
                Connection conn = DriverManager.getConnection(url,user,password);
                //2. sql문작성
                PreparedStatement ps = conn.prepareStatement(sql);
                ){

            ps.setInt(1, 80);
            //3. 실행!!
            int count = ps.executeUpdate();
            System.out.println(count + " 건 삭제했습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
