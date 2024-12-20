package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        //1.선언!!
        Connection conn = null;
        PreparedStatement ps = null;
        String url= "jdbc:mysql://localhost:3306/scott";
        String user = "like";
        String password = "lion";
        int deptno = 80;

        String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");  //드라이버로딩.
            //3. 접속. (Connection 얻기)
            conn = DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(false);
            //4. sql작성 (Statement 객체 이용.)
            ps = conn.prepareStatement(sql);
            //? 에 해당하는 값을 바인딩 해줄 필요가 있다.
            ps.setInt(1,deptno);
            ps.setString(2, "lion");
            ps.setString(3,"seoul");

            //5. 실행
            int count = ps.executeUpdate();
            //6. 결과얻기
            System.out.println(count + " 건 입력 했습니다.");
            conn.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2.닫는다.
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
