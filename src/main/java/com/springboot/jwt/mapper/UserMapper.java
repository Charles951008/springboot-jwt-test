package com.springboot.jwt.mapper;

import com.springboot.jwt.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangshengli
 */
@Mapper
public interface UserMapper {
    /**
     * 登录用户信息
     * @param user
     * @return User
     */
    User login(User user);
}
