package com.example.oauthexam.service;

import com.example.oauthexam.entity.SocialLoginInfo;
import com.example.oauthexam.repository.SocialLoginInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialLoginInfoService {
    private final SocialLoginInfoRepository socialLoginInfoRepository;

    @Transactional
    public SocialLoginInfo saveSocialLoginInfo(String provider, String socialId){
        SocialLoginInfo socialLoginInfo = new SocialLoginInfo();
        socialLoginInfo.setProvider(provider);
        socialLoginInfo.setSocialId(socialId);
        return socialLoginInfoRepository.save(socialLoginInfo);
    }

    @Transactional(readOnly = true)
    public Optional<SocialLoginInfo> findByProviderAndUuidAndSocialId(String provider, String uuid, String socialId){
        return socialLoginInfoRepository.findByProviderAndUuidAndSocialId(provider,uuid,socialId);
    }
}
