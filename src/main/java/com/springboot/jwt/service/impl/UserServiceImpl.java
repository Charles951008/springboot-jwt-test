package com.springboot.jwt.service.impl;

import com.springboot.jwt.entity.User;
import com.springboot.jwt.mapper.UserMapper;
import com.springboot.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangshengli
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User login(User user) {
        User userDB=userMapper.login(user);
        if(userDB!=null){
            return userDB;
        }
        throw new RuntimeException("登录失败~~");
    }
}
