package com.soft1851.oauth.controller;

import com.soft1851.oauth.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * @ClassName PersonController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/4/30
 **/
@RestController
@RequestMapping("/api")
@Slf4j
@Validated
public class PersonController {
    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person){
        return ResponseEntity.ok().body(person);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<String> getPersonById(@Valid @PathVariable("id") @Size(min = 6,message = "id不能小于6位数") String id){
        return ResponseEntity.ok().body(id);
    }

    @GetMapping("/person")
    public ResponseEntity<String> getPersonByName(@Valid @RequestParam("name") @Size(max = 30,message = "name长度超出范围")String name){
        return ResponseEntity.ok().body(name);
    }
}
