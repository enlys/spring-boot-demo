package com.example.demo4;

import com.example.demo4.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo4ApplicationTests {

  @Autowired
  private BookDao bookDao;

  @Test
  void contextLoads() {

    System.out.println(bookDao.getById(1));
  }

}
