package com.japan.admin.user.service;

import com.japan.admin.user.dto.UserRegisterDTO;
import com.japan.admin.user.vo.UserVO;

public interface UserService {
    void register(UserRegisterDTO dto);

    UserVO getUser(Long id);
}
