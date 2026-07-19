package com.japan.admin.user.service.impl;

import com.japan.admin.user.dto.UserRegisterDTO;
import com.japan.admin.user.entity.SysUser;
import com.japan.admin.user.mapper.UserMapper;
import com.japan.admin.user.service.UserService;
import com.japan.admin.user.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public void register(UserRegisterDTO dto) {
        SysUser user = new SysUser();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        userMapper.insert(user);
    }

    @Override
    public UserVO getUser(Long id) {
        SysUser user = userMapper.selectById(id);
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setEmail(user.getEmail());
        userVO.setAvatar(user.getAvatar());
        userVO.setUsername(user.getUsername());
        userVO.setNickname(user.getNickname());
        return userVO;
    }
}
