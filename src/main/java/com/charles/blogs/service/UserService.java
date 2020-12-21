package com.charles.blogs.service;

import com.charles.blogs.entity.User;

/**
 * @author wangshengli
 */
public interface UserService {

    /**
     * @param name
     * @param password
     * @return
     */
    User login(String name,String password);
}
