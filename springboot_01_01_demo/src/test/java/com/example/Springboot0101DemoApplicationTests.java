package com.example;

import com.example.inter.Dao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0101DemoApplicationTests {

    @Autowired
    private Dao dao;

    @Test
    void contextLoads() {
        dao.save();
    }

}
