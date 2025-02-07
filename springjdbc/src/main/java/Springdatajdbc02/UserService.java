package Springdatajdbc02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserDao userDao;
    private final TransactionTemplate transactionTemplate;

    @Transactional
    public void  createAndUpdateUser (String name, String email, String newEmail){
        userDao.addUser(name,email);

        if(newEmail.contains("error")){
            throw new RuntimeException("error");
        }

        userDao.updateUser(name,newEmail);
    }


    public void  createAndUpdateUser2 (String name, String email, String newEmail){
        transactionTemplate.execute(status -> {
            userDao.addUser(name, email);

            if (newEmail.contains("error")) {
                status.setRollbackOnly();
                throw new RuntimeException("error");
            }

            userDao.updateUser(name, newEmail);

            return null;
        });
    }
}
