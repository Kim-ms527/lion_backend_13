package org.example.jpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class UserMain {
//    private static final Logger log = LoggerFactory.getLogger(UserMain.class);
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        //findUser
//        User user = userDAO.findUser(2L);
//        System.out.println(user);  // 이코드들은 실제 동작할 때는 다 빠져야해요.
//        log.info("==================log===================");
//        log.info("find user : {}{}",user.getEmail(),user.getEmail());
//        log.info("find user : {}",user);
//
//        User user2 = userDAO.findUser(2L);
//
//        if(user == user2)
//           log.info("==");
//        else
//            log.info("!=");

        //updateUser
//        User updatUser = new User("new_carami","new_carami@exam.com");
//        updatUser.setId(2L);
//
//        userDAO.updateUser(updatUser);

//        User updateUser = userDAO.findUser(4L);
//        updateUser.setName("UpdateUser");
//
//        userDAO.updateUser(updateUser);


//        //deleteUser
//        User delUser = userDAO.findUser(4L);
//        userDAO.deleteUser(delUser);


        //createuser
        User kangUser = new User("kang3","kang3@exam.com");

        userDAO.createUser(kangUser);

        userDAO.findUser(5L);



    }
}
