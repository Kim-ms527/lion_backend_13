package com.example.oauthexam.service;

import com.example.oauthexam.dto.SocialUserRequestDto;
import com.example.oauthexam.entity.Role;
import com.example.oauthexam.entity.User;
import com.example.oauthexam.repository.RoleRepository;
import com.example.oauthexam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User saveUser(SocialUserRequestDto requestDto,PasswordEncoder passwordEncoder){
        User user = new User();
        user.setUsername(requestDto.getUsername());
        user.setName(requestDto.getName());
        user.setEmail(requestDto.getEmail());
        user.setSocialId(requestDto.getSocialId());
        user.setProvider(requestDto.getProvider());
        user.setPassword(passwordEncoder.encode(""));  //소셜로그인으로 진행하는 사용자는 비밀번호를 비워둔다.

        Role userRole = roleRepository.findByName("USER").orElseThrow();
        user.setRoles(Collections.singleton(userRole));
        log.info("여기까지 잘오나요?? ");
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public Optional<User> findByProviderAndSocialId(String provider, String socialId){
        return userRepository.findByProviderAndSocialId(provider,socialId);
    }


}
