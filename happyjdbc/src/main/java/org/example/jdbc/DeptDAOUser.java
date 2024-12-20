package org.example.jdbc;

import java.util.List;

public class DeptDAOUser {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();

        DeptDTO deptDTO = new DeptDTO();
        deptDTO.setDeptno(110);
        deptDTO.setDname("lion");
        deptDTO.setLoc("busan");

//        boolean result = deptDAO.addDept(deptDTO);
//
//        if(result)
//            System.out.println("성공!!");
//        else
//            System.out.println("실패!!");

//        System.out.println(deptDAO.updateDept(deptDTO) + "건 수정됨.");

//        deptDAO.deleteDept(110);
//        DeptDTO resultDTO = deptDAO.getDept(40);
//        System.out.println(resultDTO);


        List<DeptDTO> list =  deptDAO.getDeptList();
        for(DeptDTO dto : list){
            System.out.println(dto);
        }

    }
}
