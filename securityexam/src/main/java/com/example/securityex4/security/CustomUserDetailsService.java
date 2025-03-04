package com.example.securityex4.security;

import com.example.securityex4.domain.Role;
import com.example.securityex4.domain.User;
import com.example.securityex4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("username ::: "+ username);
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(username +"에 해당하는 사용자가 없습니다.");
        }

        UserBuilder userBuilder = org.springframework.security.core.userdetails.User.withUsername(username);
        userBuilder.password(user.getPassword());

        userBuilder.roles(user.getRoles().stream().map(Role::getName).toList().toArray(new String[0]));

        return userBuilder.build();
    }
}
