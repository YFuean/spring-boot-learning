package com.soft1851.springboot.jwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;


/**
 * @ClassName Decrypt
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/15
 **/
public class Decrypt {
    /**
     * 先验证token是否被伪造，然后解码token。
     * @param token 字符串token
     * @return 解密后的DecodedJWT对象，可以读取token中的数据。
     */
    public DecodedJWT deToken(final String token,final String userId) {
        DecodedJWT jwt = null;
        try {
            // 使用了HMAC256加密算法, mySecret是用来加密数字签名的密钥。
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(Base64Util.jdkBas64Encode2(userId)))
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
            jwt = verifier.verify(token);
        } catch (JWTVerificationException | IllegalArgumentException exception){
            exception.printStackTrace();
        }

        return jwt;
    }
}
