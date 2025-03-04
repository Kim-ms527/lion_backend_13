package com.example.securityex4.service;

import com.example.securityex4.domain.Role;
import com.example.securityex4.domain.User;
import com.example.securityex4.domain.UserRegiserDTO;
import com.example.securityex4.repository.RoleRepository;
import com.example.securityex4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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

    public User registUser(UserRegiserDTO regiserDTO){
        String encodedPassword = passwordEncoder.encode(regiserDTO.getPassword());

        Set<Role> roles = regiserDTO.getRoles().stream()
                .map(roleRepository::findByName)
                .flatMap(Optional::stream)  //Optional이 비어있다면, 무시하고  값만 추출
                .collect(Collectors.toSet());

        User user = new User();
        user.setUsername(regiserDTO.getUsername());
        user.setPassword(encodedPassword);    //인코딩한 password
        user.setName(regiserDTO.getName());
        user.setEmail(regiserDTO.getEmail());
        user.setRoles(roles);   //roles

       return userRepository.save(user);
    }

    //username에 해당하는 사용자가 있는지 체크.
    public boolean existsUser(String username){
        return userRepository.existsByUsername(username);
    }
}
