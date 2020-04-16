package com.soft1851.springboot.jwt.util;

import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.java.Log;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/15
 **/
public class Test {
    static long time = 0;
    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken("1802343337",true);

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token,"1802343337");

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVIP").asBoolean());
        System.out.println("userId:     " + jwt.getClaim("userId").asString());
        long currentTime = System.currentTimeMillis();
        time = jwt.getExpiresAt().getTime();
        System.out.println("token未失效");
        while (currentTime<=time){
            currentTime = System.currentTimeMillis();
        }
        System.out.println("token失效");
    }
}
