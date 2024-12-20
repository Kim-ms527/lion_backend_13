package org.example.jdbc;

public class DeptDAOUser {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();

        DeptDTO deptDTO = new DeptDTO();
        deptDTO.setDeptno(110);
        deptDTO.setDname("test부서");
        deptDTO.setLoc("판교");

        boolean result = deptDAO.addDept(deptDTO);

        if(result)
            System.out.println("성공!!");
        else
            System.out.println("실패!!");
    }
}
