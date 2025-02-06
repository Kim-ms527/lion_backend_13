package spirngdatajdbc01;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> ,CustomUserRepository{
    List<User> findByName(String name); //이 메서드 누가 구현했을까요?  select * from users where name = ?
    List<User> findByEmail(String name); //select * from users where email = ?
}
