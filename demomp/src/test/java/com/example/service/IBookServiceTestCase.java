package com.example.service;

import com.example.domain.Book;
import com.example.service.impl.BookServiceImpl;
import com.example.service.impl.IBookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTestCase {

  @Autowired
  private IBookServiceImpl bookService;

  @Test
  void save() {
    Book book = new Book();
    book.setTitle("go");
    book.setName("golang");
    System.out.println(bookService.save(book));
  }
}
