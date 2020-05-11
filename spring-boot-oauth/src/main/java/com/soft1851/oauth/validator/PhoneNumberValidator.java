package com.soft1851.oauth.validator;

import com.soft1851.oauth.interfac.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @Author: yue_fan
 * @Date: 2020/4/30
 * @Description:
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber,String > {
    @Override
    public boolean isValid(String number, ConstraintValidatorContext constraintValidatorContext){
        Pattern p = compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        //Pattern p = compile("(^1(3[0-2]|4[5]|5[56]|7[6]|8[56])\\d{8}$)|(^1709\\d{7}$)");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
