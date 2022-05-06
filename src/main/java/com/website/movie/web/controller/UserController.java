package com.website.movie.web.controller;

import com.website.movie.biz.dto.UserDto;
import com.website.movie.biz.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/gets.api")
    public List<UserDto> gets() {
        return userService.gets();
    }

    @GetMapping("/login")
    public  String login() {
        return "login";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @GetMapping("/joinProc")
    public @ResponseBody
    String joinProc() {
        return "회원가입 완료됨!";
    }

}
