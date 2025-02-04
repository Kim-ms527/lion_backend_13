package jdbc02.dao;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jdbcTemplate;



    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name,email) VALUES(?,?)";
        int count = jdbcTemplate.update(sql,user.getName(),user.getEmail());
        System.out.println(count);
    }

    @Override
    public List<User> findAllUsers() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email=? WHERE name = ?";
        jdbcTemplate.update(sql, email,name);
    }

    @Override
    public void deleteUser(String name) {
        jdbcTemplate.update("DELETE FROM users WHERE name = ?",name);
    }
}
