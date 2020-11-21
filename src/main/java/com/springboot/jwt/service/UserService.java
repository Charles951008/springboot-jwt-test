package com.springboot.jwt.service;

import com.springboot.jwt.entity.User;

/**
 * @author wangshengli
 */
public interface UserService {
    /**
     * @param user
     * @return
     */
    User login(User user);
}
