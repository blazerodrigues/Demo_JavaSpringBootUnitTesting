package com.demo.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CalculatorTests {

    @Autowired
    private Calculator c;

    @Test
    void testSum(){

        //expected
        int expectedResult = 20;

        //actual
        int actualResult = c.doSum(12,3,2);

        //using AssertJ for assertion
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void testProduct(){
        //expected
        int expectedResult = 6;

        //actual
        int actualResult = c.doProduct(3,2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testCompareNums(){
        //actual result
        Boolean actualResult = c.compareTwoNums(5,5);

        assertThat(actualResult).isTrue();
    }

}

