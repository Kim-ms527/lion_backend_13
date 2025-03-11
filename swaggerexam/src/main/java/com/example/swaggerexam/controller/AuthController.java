package com.example.swaggerexam.controller;

import com.example.swaggerexam.dto.LoginRequestDto;
import com.example.swaggerexam.dto.RegisterRequestDto;
import com.example.swaggerexam.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "인증 관련 API")
public class AuthController {
    @Operation(
            summary = "회원가입",
            description = "이메일과 비밀번호를 입력하여 회원가입을 합니다.",
            tags = {"Authentication"}
    )
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequestDto requestDto){

        //여기 로직은 나중에 여러분이 완성해주세요.

        return ResponseEntity.ok("ok");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto requestDto){

        //로그인이 수행될때 할일 구현

        return ResponseEntity.ok("ok");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(
            @Parameter(description = "JWT 인증 토큰", required = true, example = "Bearer eyJhbGciOiJIUzI....")
            @RequestHeader("Authorization") String token
    ){


        return ResponseEntity.ok("로그아웃 성공");
    }

    @Operation(summary = "사용자 목록 조회", description = "사용자 목록을 페이지 단위로 조회합니다.")
    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
//        List<UserDto> users = userService.getUsers(page, size);
        return ResponseEntity.ok(null);
    }
    @Operation(summary = "사용자 정보 조회", description = "사용자의 고유 ID를 이용하여 정보를 조회합니다.")
    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUserById(
            @PathVariable("id") Long id) {
//        UserDto user = userService.getUserById(id);
        return ResponseEntity.ok(null);
    }

}
