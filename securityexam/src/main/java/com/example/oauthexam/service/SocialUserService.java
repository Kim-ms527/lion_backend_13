package com.example.oauthexam.service;

import com.example.oauthexam.entity.SocialUser;
import com.example.oauthexam.repository.SocialUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialUserService {
    private final SocialUserRepository socialUserRepository;

    //소설에서 보내준 정보를 저장하기 위한 메서드!!
    @Transactional
    public SocialUser saveOrUpdateUser(String socialId, String provider, String username, String email, String avatarUrl){
        Optional<SocialUser> existingUser = socialUserRepository.findBySocialIdAndProvider(socialId, provider);
        SocialUser socialUser;
        if(existingUser.isPresent()) {
            // 이미 소셜 정보를 가진 사용자라면..
            socialUser = existingUser.get();
            socialUser.setUsername(username);
            socialUser.setEmail(email);
            socialUser.setAvatarUrl(avatarUrl);
        }else{
            //처음방문
            socialUser = new SocialUser();
            socialUser.setSocialId(socialId);
            socialUser.setUsername(username);
            socialUser.setEmail(email);
            socialUser.setAvatarUrl(avatarUrl);
            socialUser.setProvider(provider);
        }
        return socialUserRepository.save(socialUser);
    }
}
