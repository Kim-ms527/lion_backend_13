package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectManyTest {
    public static void main(String[] args) {
        //1. 선언
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //조건에 맞는 데이터 1권조회   와   여러건 조회 !!
        String sql = "select deptno, dname, loc from dept";
        try{
            //3. 접속
            conn = DBUtil.getConnection();
            //4. 쿼리 작성
            ps = conn.prepareStatement(sql);
            //5. 쿼리실행
            rs = ps.executeQuery();
            //6. 결과 얻어오기!!
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString("dname"));
                System.out.println(rs.getString(3));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //2.닫는코드
            DBUtil.close(conn,ps,rs);
        }
    }


}
