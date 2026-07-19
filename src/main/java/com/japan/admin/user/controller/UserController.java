package com.japan.admin.user.controller;

import com.japan.admin.common.result.Result;
import com.japan.admin.user.dto.UserRegisterDTO;
import com.japan.admin.user.service.UserService;
import com.japan.admin.user.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public Result<Void> register(
            @RequestBody UserRegisterDTO dto){
        userService.register(dto);
        return Result.success(null);
    }

    @GetMapping("/{id}")
    public Result<UserVO> getUser(
            @PathVariable Long id){
        return Result.success(
                userService.getUser(id)
        );
    }


}
