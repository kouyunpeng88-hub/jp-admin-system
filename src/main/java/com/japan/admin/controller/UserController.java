package com.japan.admin.controller;

import com.japan.admin.common.result.Result;
import com.japan.admin.dto.LoginDTO;
import com.japan.admin.service.UserService;
import com.japan.admin.vo.UserVO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public Result<UserVO> login(
            @Valid
            @RequestBody
            LoginDTO dto){
        return Result.success(
                userService.login(dto)
        );
    }

}
