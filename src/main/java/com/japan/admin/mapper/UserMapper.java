package com.japan.admin.mapper;


import com.japan.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    User findByUsername(String username);
}