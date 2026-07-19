package com.japan.admin.user.entity;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SysUser {

    private Long id;

    private String username;

    private String password;

    private String email;
    //昵称
    private String nickname;
    //头像
    private String avatar;
    //状态
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}