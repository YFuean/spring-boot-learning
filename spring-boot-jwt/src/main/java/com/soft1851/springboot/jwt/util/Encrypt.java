package com.soft1851.springboot.jwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.servlet.ViewResolver;

import java.util.Base64;
import java.util.Date;

/**
 * @ClassName Encrypt
 * @Description 生成加密后的token
 * @Author yue_fan
 * @Date 2020/4/15
 **/
public class Encrypt {
    public String getToken(final String userId,final boolean isVIP){
        String token = null;

        try{
            Date expiresAt = new Date(System.currentTimeMillis()+360000L);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("userId",userId)
                    .withClaim("isVIP",isVIP)
                    .withExpiresAt(expiresAt)
                    //使用HMAC256加密算法
                    .sign(Algorithm.HMAC256(Base64Util.jdkBas64Encode2(userId)));
        }catch (Exception e){

        }
        return token;
    }
}
