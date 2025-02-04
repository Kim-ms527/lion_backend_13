package jdbc02.dao;

import java.util.List;

public interface DeptDao {
    void insertDept(Dept dept);
    List<Dept> findAllDept();
    void updateDept(Dept dept); // id에 해당하는 deptName과 location 을 수정하는메서드
    void deleteDept(Long id); //id에 해당하는 dept 삭제
}
