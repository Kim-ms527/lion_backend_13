package com.example.swaggerexam.service;

import com.example.swaggerexam.entity.User;
import com.example.swaggerexam.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTestWithMock {
    @Mock
    private UserRepository userRepository;   //가짜객체.

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);  //Mockito 초기화
    }

    @Test
    @DisplayName("회원가입 - 성공")
    void register_success(){
        String email = "test@test@exam.com";
        String password = "pass123";

        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        String response = userService.register(email, password);

        assertEquals("회원가입 성공!!",response);
        verify(userRepository,times(1)).save(any(User.class));   //save() 호출 rjawmd.
    }

    @Test
    @DisplayName("회원가입 - 이메일 중복 실패")
    void register_EmailFail(){
        String email = "test@test@exam.com";
        String password = "pass123";

        when(userRepository.findByEmail(email)).thenReturn(Optional.of(new User()));

        String resopnse = userService.register(email, password);
        assertEquals("이미 존재하는 아이디 입니다.",resopnse);
        verify(userRepository, never()).save(any(User.class));  //검증.  save() 호출하지 않았는지 검증!!
    }
}