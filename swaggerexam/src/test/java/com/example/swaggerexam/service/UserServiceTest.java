package com.example.swaggerexam.service;

import com.example.swaggerexam.entity.User;
import com.example.swaggerexam.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional  //테스트가 끝나면 DB 변경 사항들을 롤백 시켜줌.
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("회원가입 - 성공")
    void register_success() {
        String email = "tset111@exam.com";
        String password = "1234";
        String response = userService.register(email, password);

        assertEquals("회원가입 성공!!", response);
        assertTrue(userRepository.findByEmail(email).isPresent());
    }

    @Test
    @DisplayName("회원가입 - 이메일 중복 실패")
    void register_EmailFail(){
        String email = "test@example.com";
        String password = "pass123";

        //기존 사용자 저장
        User existingUser = new User();
        existingUser.setEmail(email);
        existingUser.setPassword(password);
        userRepository.save(existingUser);

        //동일한 이메일로 회원가입 테스트
        String response = userService.register(email, password);
        assertEquals("이미 존재하는 아이디 입니다.", response);
    }

}