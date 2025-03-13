package com.example.swaggerexam;

import com.example.swaggerexam.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SwaggerexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerexamApplication.class, args);
	}


	@Bean
	public CommandLineRunner run(UserService userService){
		return args -> {
			String message = userService.register("abc@abc.com", "1234");
			System.out.println(message);

		};
	}

}
