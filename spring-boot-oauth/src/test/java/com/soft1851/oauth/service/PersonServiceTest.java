package com.soft1851.oauth.service;

import com.soft1851.oauth.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonServiceTest {
    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() {
        Person person = new Person();
        person.setId("180234333a");
        person.setName("cat");
        person.setAge(19);
        person.setPhone("13775229600");
        person.setEmail("yfueanqaq@gmail.com");
        person.setSex("Man");
        personService.validatePerson(person);
    }
}