package com.soft1851.oauth.service;

import com.soft1851.oauth.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @ClassName PsersonService
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/30
 **/
@Service
@Validated
@Slf4j
public class PersonService {
    public void validatePerson(@Valid Person person){
        log.info("service方法验证");
    }
}
