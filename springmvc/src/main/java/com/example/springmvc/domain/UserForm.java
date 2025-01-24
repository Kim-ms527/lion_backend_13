package com.example.springmvc.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    @NotEmpty(message = "username 은 공백을 허용하지 않습니다.")
    @Size(min = 5, max = 20, message = "username은 5-20자 까지만 허용합니다.")
    @Pattern(
            regexp = ".*[!@#$%^&*(),.?\":{}|<>].*",
            message = "비밀번호는 최소 하나의 특수문자를 포함해야 합니다."
    )
    private String username;

    @NotEmpty(message = "비밀번호는 공백을 허용하지 않습니다.")
    @Size(min = 6, message = "비밀번호는 최소 6자 이상 입력해야 합니다.")
    private String password;
}
