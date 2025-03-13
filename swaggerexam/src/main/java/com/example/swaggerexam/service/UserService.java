package com.example.swaggerexam.service;


import com.example.swaggerexam.entity.User;
import com.example.swaggerexam.repository.UserRepository;
import com.example.swaggerexam.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    //회원가입.
//    회원가입은 email, password 를 받아서 DB에 저장하고,  리턴.. "성공" "이미 존재하는 아이디"
    @Transactional
    public String register(String email, String password){
        //저 이메일이 이미 존재하는지 체크.
        if(userRepository.findByEmail(email).isPresent()) {
            //존재한다면??  "이미 존재하는 아이디" 라고 리턴
            return "이미 존재하는 아이디 입니다.";
        }
        //존재하지 않는다면??
        //엔티티를 생성해서, 엔티티에 이메일, 패스워드값을 넣고,
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        // userRepository에게 부탁해서 저장.
        userRepository.save(user);
        //return 으로 "회원 가입성공"
        return "회원가입 성공!!";
    }
}
