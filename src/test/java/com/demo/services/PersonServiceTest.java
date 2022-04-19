package com.demo.services;

import com.demo.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    private PersonService personService;

    @Mock //using mockito to create mock object
    private PersonRepo personRepo;

    @BeforeEach //runs before each test case
    void setUp(){
        this.personService = new PersonService(this.personRepo); //personservice is created using constructor, we are passing in the mock personrepo object created by mockito to the constructor.
    }

    @Test
    void getAllPerson(){

        personService.getAllPerson();

        verify(personRepo).findAll();

    }

}