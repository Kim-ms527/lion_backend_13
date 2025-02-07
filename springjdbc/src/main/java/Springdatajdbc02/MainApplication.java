package Springdatajdbc02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao,UserService userService){
        return args -> {

//            userDao.createAndUpdateUser("lion6","lion6@exam.com","errorlike6@exam.com");

            userService.createAndUpdateUser2("lion8","lion8@exam.com","errorlike8@exam.com");
        };
    }
}
