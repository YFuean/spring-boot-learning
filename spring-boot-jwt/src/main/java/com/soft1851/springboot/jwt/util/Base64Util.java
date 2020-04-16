package com.soft1851.springboot.jwt.util;

import java.util.Base64;

/**
 * @ClassName Base64Util
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/15
 **/
public class Base64Util {

    /**
     * jdk base64加密 jdk util
     * @param src
     * @return
     */
    public static String jdkBas64Encode2(String src) {
        return Base64.getEncoder().encodeToString(src.getBytes());
    }

    /**
     * jdk base64揭秘 jdk util
     * @param encodeData
     * @return
     */
    public static String jdkBas64Decode2(String encodeData) {
        return new String(Base64.getDecoder().decode(encodeData));
    }

    public static void main(String[] args) {
        System.out.println(Base64Util.jdkBas64Encode2("1802343337"));
    }
}
