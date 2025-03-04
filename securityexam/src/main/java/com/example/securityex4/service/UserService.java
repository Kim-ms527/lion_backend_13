package com.example.securityex4.service;

import com.example.securityex4.domain.Role;
import com.example.securityex4.domain.User;
import com.example.securityex4.repository.RoleRepository;
import com.example.securityex4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    //회원가입
    @Transactional
    public User registUser(User user){
        //롤 정보를 User 엔티티에 채워줄 필요가 있겠네요.
        //일단은 회원가입 요청이 들어오면 USER 권한으로 가입.
        Role userRole = roleRepository.findByName("USER").get();
        user.setRoles(Collections.singleton(userRole));

        //패스워드는 반드시 암호화해서 넣어준다.
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    //username에 해당하는 사용자가 있는지 체크.
    public boolean existsUser(String username){
        return userRepository.existsByUsername(username);
    }
}
