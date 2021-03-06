package ru.javaluxurywatches.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BaseControllerTest {

    @Autowired
    private BaseController baseController;

    @Test
    void testMethod() {
        Assertions.assertTrue(baseController.testMethod());
    }

}