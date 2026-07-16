package com.japan.admin.service.impl;

import com.japan.admin.dto.LoginDTO;
import com.japan.admin.entity.User;
import com.japan.admin.mapper.UserMapper;
import com.japan.admin.service.UserService;
import com.japan.admin.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserVO login(LoginDTO dto) {
        User user = userMapper.findByUsername(dto.getUsername());
        if(user==null){
            throw new RuntimeException("用户不存在");
        }
        if(!user.getPassword().equals(dto.getPassword())){
            throw new RuntimeException("密码错误");
        }
        UserVO vo = new UserVO();

        vo.setId(user.getId());

        vo.setUsername(user.getUsername());

        vo.setNickname(user.getNickname());

        return vo;
    }
}
