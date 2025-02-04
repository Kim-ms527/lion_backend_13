package jdbc03.dao;

import jdbc03.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;



    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name,email) VALUES(?,?)";
        try {
            jdbcTemplate.update(sql, user.getName(), user.getEmail());
        } catch (DataAccessException e) {
            throw new DataAccessException("사용자가 잘못된 값을 입력 했습니다. "+ user.getName(),e){};
        }

    }

    @Override
    public List<User> findAllUsers() {
        try {
            return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
        } catch (DataAccessException e) {
            throw new DataAccessException("에러가 발생했어요.",e){};
        }
    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email=? WHERE name = ?";
        int updated = jdbcTemplate.update(sql, email,name);
        if(updated == 0)
            throw new UserNotFoundException("user를 찾을 수 없어요."+name);
    }

    @Override
    public void deleteUser(String name) {
       int deleted =  jdbcTemplate.update("DELETE FROM users WHERE name = ?",name);
       if(deleted == 0)
           throw new UserNotFoundException("user를 찾을 수 없어요."+name);
    }
}
