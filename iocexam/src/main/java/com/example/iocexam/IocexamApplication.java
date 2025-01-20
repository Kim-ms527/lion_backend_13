package com.example.iocexam;

import com.example.iocexam.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocexamApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(IocexamApplication.class, args);
//		UserController controller =	context.getBean(UserController.class);
//		controller.joinUser();
	}

	@Autowired
	UserController userController;

	@Override
	public void run(String... args) throws Exception {
		//간단한 테스트를 진행할때..  서버가 실행된 후에 해당 메서드를 호출해줌.
		userController.joinUser();
	}
}
