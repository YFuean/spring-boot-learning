package com.soft1851.oauth.entity;

import com.soft1851.oauth.interfac.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @ClassName Person
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/30
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "id不能为空")
    private String id;

    //@Size(max = 30)
    @NotNull(message = "name不能为空")
    private String name;

    @Min(18)
    private Integer age;

    @PhoneNumber(message = "手机号码格式错误")
    @NotNull(message = "手机号不能为空")
    private String phone;

    @NotNull(message = "email不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))",message = "sex值不在可选范围")
    @NotNull(message = "sex不能为空")
    private String sex;
}
