package com.demo.repo;

import com.demo.entites.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExistsById() {
        //creating a new person and saving it in the DB
        Person person = new Person(123, "John", "New York");
        personRepo.save(person);

        //actual result
        Boolean actualResult = personRepo.isPersonExistsById(123);

        //assertion
        assertThat(actualResult).isTrue();
    }

    @AfterEach //this runs after each test case
    void afterEachExample(){
        System.out.println("AFTER EACH");
//        personRepo.deleteAll();
    }

}