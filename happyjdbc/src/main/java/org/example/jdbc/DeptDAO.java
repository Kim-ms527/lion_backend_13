package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeptDAO {
    //기본 CRUD
    //insert  -- c
    //dept 테이블에 데이터를 한 건 입력하는 메소드를 정의하세요.
    public boolean addDept(DeptDTO deptDTO){
        boolean flag = false;
        //1.필요한 객체선언
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
        try{
            //3. 접속
            conn = DBUtil.getConnection();
            //4. 쿼리작성
            ps = conn.prepareStatement(sql);
            ps.setInt(1,deptDTO.getDeptno());
            ps.setString(2, deptDTO.getDname());
            ps.setString(3,deptDTO.getLoc());

            //5.쿼리실행
            int count = ps.executeUpdate();

            if(count == 1)
                flag = true;

        }catch (Exception e){
            System.out.println(e);
        }finally {
            //2. 선언한 객체 닫기
            DBUtil.close(conn,ps);
        }
        return flag;
    }

    //update    -- u
    public int updateDept(DeptDTO deptDTO){
        int resultCount = 0;
        String sql = "update dept set dname=? where deptno = ?";
        try(
                Connection conn = DBUtil.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ){
            ps.setString(1, deptDTO.getDname());
            ps.setInt(2, deptDTO.getDeptno());

            resultCount = ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultCount;
    }

    //delete   -- d
    public void deleteDept(int deptno){
        String sql = "delete from dept where deptno=?";
        try(
                Connection conn = DBUtil.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ){
            ps.setInt(1,deptno);
            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
