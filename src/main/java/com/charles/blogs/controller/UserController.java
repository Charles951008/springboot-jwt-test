package com.charles.blogs.controller;

import com.charles.blogs.utils.JWTUtils;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.charles.blogs.entity.User;
import com.charles.blogs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshengli
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public Map<String, Object> login(User user) {
        Map<String, Object> result = new HashMap<>();
        log.info("用户名：[{}]", user.getName());
        log.info("密码：[{}]", user.getPassword());
        try {
            User userDB = userService.login(user);
            Map<String, String> map = new HashMap<>();
            map.put("id", userDB.getId());
            map.put("username", userDB.getName());
            map.put("password",userDB.getPassword());
            String token = JWTUtils.getToken(map);
            result.put("state", true);
            result.put("msg", "登录成功!!!");
            //成功返回token信息
            result.put("token", token);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("state", "false");
            result.put("msg", e.getMessage());
        }
        return result;
    }

    @PostMapping("/user/test")
    public Map<String, Object> test(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        String token = request.getHeader("token");
        DecodedJWT verify=JWTUtils.verify(token);
        log.info("用户id为：[{}]",verify.getClaim("id").asString());
        log.info("用户name为：[{}]",verify.getClaim("username").asString());
        log.info("用户密码为：[{}]",verify.getClaim("password").asString());
        map.put("status", true);
        map.put("msg", "请求成功！");

        return map;
    }
}
