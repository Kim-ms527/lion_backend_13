package com.example.securityexam3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HomeService {
    public void userLog(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
         Object principal = authentication.getPrincipal();
        if(principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;

           log.info("현재 로그인 한 사용자 : "+userDetails.getUsername());
        }else {

            log.info("현재 로그인 한 사용자 pp: "+principal.toString());
        }
    }
}
