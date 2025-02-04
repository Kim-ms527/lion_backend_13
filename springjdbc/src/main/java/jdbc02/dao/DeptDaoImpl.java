package jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor
@Repository
public class DeptDaoImpl implements DeptDao{
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void insertDept(Dept dept) {
        String sql = "INSERT INTO dept (dept_name,location) VALUES (?,?)";
        jdbcTemplate.update(sql,dept.getDeptName(),dept.getLocation());
    }

    @Override
    public List<Dept> findAllDept() {
        RowMapper<Dept> rowMapper = new RowMapper<Dept>() {
            @Override
            public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Dept(
                        rs.getLong("dept_no"),
                        rs.getString("dept_name"),
                        rs.getString("location")
                );
            }
        };
        String sql = "SELECT dept_no, dept_name, location FROM dept";
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public void updateDept(Dept dept) {
        String sql = "UPDATE dept SET dept_name=?, location=? WHERE dept_no=?";
        jdbcTemplate.update(sql,dept.getDeptName(),dept.getLocation(),dept.getId());
    }

    @Override
    public void deleteDept(Long id) {
        String sql = "DELETE FROM dept WHERE dept_no = ?";
        jdbcTemplate.update(sql, id);
    }

}
