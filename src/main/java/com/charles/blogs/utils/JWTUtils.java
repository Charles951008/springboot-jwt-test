package com.charles.blogs.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

/**
 * 生成Token
 * @author wangshengli
 * @return 返回token
 */
public class JWTUtils {
    private static String TOKEN = "!q@w#e";

    /**
     * @param map
     * @return
     */
    public static String getToken(Map<String,String> map){
        JWTCreator.Builder builder= JWT.create();
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        Calendar instance=Calendar.getInstance();
        instance.add(Calendar.MINUTE,60);
        //指定灵牌过期时间
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(TOKEN)).toString();
    }

    /**
     * 验证token合法性
     * @param token
     */
    public static DecodedJWT verify(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

    /**
     * 获取token信息的方法
     * @param token
     * @return
     */
    public static DecodedJWT getToken(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

}
