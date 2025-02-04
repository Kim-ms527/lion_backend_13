package jdbc02;

import jdbc02.dao.DeptDao;
import jdbc02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication02 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication02.class);
    }

    @Autowired
    private UserDao userDao;
    @Autowired
    private DeptDao deptDao;
    @Override
    public void run(String... args) throws Exception {
        //insert test
//        userDao.insertUser(new User(null,"kang","kang@exam.com"));
        //update test
        userDao.updateUserEmail("kang", "kang22@exam.com");

        //delete test
//        userDao.deleteUser("kang");
        //select test
//        List<User> users = userDao.findAllUsers();
//        for(User user : users){
//            System.out.println(user);
//        }

//        deptDao.insertDept(new Dept(null,"ACCOUNTING","NEW YORK"));
//          List<Dept> deptList =  deptDao.findAllDept();
//          for(Dept dept:deptList){
//              System.out.println(dept.getDeptName() +"::"+dept.getLocation());
//          }

//        deptDao.updateDept(new Dept(1L,"update1","updateTest"));

        deptDao.deleteDept(1L);
    }
}
