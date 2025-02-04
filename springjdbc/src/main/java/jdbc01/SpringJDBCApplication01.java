package jdbc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class SpringJDBCApplication01 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBCApplication01.class);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        //spring JDBC 가 대신 해주지 못하는것은 무엇일까요?
        //입력
//        String sql = "INSERT INTO users(name,email) VALUES(?,?)";
//        int count = jdbcTemplate.update(sql,"carami","carami@exam.com");
//        System.out.println(count);

        //쿼리가 실행될때 결과값을 어디에 담아줄껀지를 알려줘야해요.
        //RowMapper 를 이용해서 결과값을 담아준다.
//        List<User> users = jdbcTemplate.query("SELECT id,name,email FROM users", new BeanPropertyRowMapper<>(User.class));


        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new User(
                       rs.getLong("id"),
                       rs.getString("name"),
                       rs.getString("email")
                );
            }
        };

        List<User> users = jdbcTemplate.query("SELECT id,name,email FROM users", rowMapper);

        for(User user: users){
            System.out.println(user);
        }

    }
}
