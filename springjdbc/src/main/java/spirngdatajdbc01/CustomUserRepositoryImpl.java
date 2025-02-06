package spirngdatajdbc01;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository{
    private final NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public Page<User> findAllUsersWithPagination(Pageable pageable) {
        String query = """
        SELECT 
        id, name, email 
        FROM users 
        LIMIT :limit 
        OFFSET :offset
        """;

        Map<String, Object> params = new HashMap<>();
        params.put("limit", pageable.getPageSize());
        params.put("offset", pageable.getOffset());


       List<User> users = jdbcTemplate.query(query,params, new BeanPropertyRowMapper<>(User.class));

       String countQuery = "SELECT count(*) FROM users";

       return PageableExecutionUtils.getPage(users,pageable,
                ()->jdbcTemplate.queryForObject(countQuery,params,Long.class));

    }
}
