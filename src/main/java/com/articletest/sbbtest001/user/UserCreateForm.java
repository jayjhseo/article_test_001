package com.articletest.sbbtest001.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @NotEmpty(message = "유저네임은 필수사항")
    @Email
    private String username;
    @NotEmpty(message = "닉네임은 필수사항")
    private String nickname;
    @NotEmpty(message = "비밀번호는 필수사항")
    private String password;
    @NotEmpty(message = "비밀번호 확인은 필수사항")
    private String password2;
}
