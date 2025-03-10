package com.example.oauthexam.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialUserRequestDto {
    @NotBlank(message = "Provider 는 필수 값입니다.")
    private String provider;
    private String socialId;
    private String name;
    private String email;
    private String username;
    private String uuid;
}
