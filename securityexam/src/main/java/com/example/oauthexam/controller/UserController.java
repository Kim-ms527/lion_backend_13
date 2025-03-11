package com.example.oauthexam.controller;

import com.example.oauthexam.dto.SocialUserRequestDto;
import com.example.oauthexam.entity.SocialLoginInfo;
import com.example.oauthexam.entity.User;
import com.example.oauthexam.security.CustomUserDetails;
import com.example.oauthexam.service.SocialLoginInfoService;
import com.example.oauthexam.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    private final SocialLoginInfoService socialLoginInfoService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "oauth/welcome";
    }


    @GetMapping("/loginform")
    public String loginform(){
        return "oauth/users/loginform";
    }

    @GetMapping("/registerSocialUser")
    public String registerSocialUser(@RequestParam("provider") String provider, @RequestParam("socialId") String socialId
    , @RequestParam("name") String name, @RequestParam("uuid") String uuid, Model model){
//?provider="+provider+"&socialId="+socialId+"&name="+name+"&uuid="+socialLoginInfo.getUuid()
        model.addAttribute("provider",provider);
        model.addAttribute("socialId",socialId);
        model.addAttribute("name",name);
        model.addAttribute("uuid",uuid);

        return "oauth/users/registerSocialUser";
    }

    @PostMapping("/saveSocialUser")
    public String saveSocialUser(@ModelAttribute SocialUserRequestDto requestDto){
        Optional<SocialLoginInfo> socialLoginInfoOptional
                = socialLoginInfoService.findByProviderAndUuidAndSocialId(
                requestDto.getProvider(), requestDto.getUuid(), requestDto.getSocialId());

        if(socialLoginInfoOptional.isPresent()){
            log.info("socialLoginInfoOptional.isPresent()"+socialLoginInfoOptional.isPresent());
            SocialLoginInfo socialLoginInfo = socialLoginInfoOptional.get();
            LocalDateTime now = LocalDateTime.now();
            Duration duration = Duration.between(socialLoginInfo.getCreateAt(), now);
            if(duration.toMinutes() > 20){
                return "redirect:/error";   //20분 이상 경과하면.. 에러페이지로 리다이렉트!!!
            }

            userService.saveUser(requestDto, passwordEncoder);


            return "redirect:/";
        }else {
            return "redirect:/error";
        }

    }
    @GetMapping("/info")
    public String info(@AuthenticationPrincipal Object customUserDetails, Model model){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user",principal);

        return "oauth/info";
    }


}
