package com.springboot.jwt.entity;

import lombok.Data;

/**
 * @author wangshengli
 */
@Data
public class User {
    private String id;
    private String name;
    private String password;
}
