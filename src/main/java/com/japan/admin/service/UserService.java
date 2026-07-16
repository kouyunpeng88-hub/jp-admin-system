package com.japan.admin.service;

import com.japan.admin.dto.LoginDTO;
import com.japan.admin.vo.UserVO;

public interface UserService {
    public UserVO login(LoginDTO dto);
}
