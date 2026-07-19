package com.japan.admin.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.japan.admin.user.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<SysUser> {
}