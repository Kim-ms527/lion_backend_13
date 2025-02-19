package com.example.springdatajpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UserRepository repository){
		return args -> {
			//create
//			User user = new User("Hong","hong@example.com");
//			repository.save(user);
//			log.info("사용자 추가 :: "+user);

			//delete
//			User user = repository.findById(15L).get();
//			repository.delete(user);

			//update
//			User user = repository.findById(11L).get();
//			user.setName("강경미");
//			user.setEmail("carami@nate.com");
//
//			repository.save(user);

//			repository.findAll().forEach(user -> log.info(user.toString()));

//			List<User> caramis = repository.findByName("carami");
////			caramis.forEach(user -> user.toString());
//			for(User user : caramis){
//				log.info(user.toString());
//			}

//			repository.findByName("kang").forEach(user -> log.info(user.toString()));

//			repository.selectUser("kang").forEach(user -> log.info(user.toString()));
//			repository.selectUserLike("kan").forEach(user -> log.info(user.toString()));

//			int count = repository.deleteByEmail("kang2@exam.com");
//
//			log.info("delete count :: "+ count);

//			int updateCount = repository.updateByEmail(9L, "kang@gmail.com");
//			log.info("update count :: "+ updateCount);

//			repository.selectByEmailNative("exam").forEach(user -> log.info(user.toString()));
			Pageable pageable = PageRequest.of(0, 3);
			repository.findByNameContaining("a",pageable ).forEach(user -> log.info(user.toString()));
			log.info("=======================");
			repository.findAll(pageable).forEach(user -> log.info(user.toString()));
		};
	}
}
