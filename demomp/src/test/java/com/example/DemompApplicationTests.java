package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemompApplicationTests {

  @Autowired
  private BookDao bookDao;

  @Test
  void contextLoads() {
    System.out.println(bookDao.selectById(1));
    bookDao.selectCount(null);
  }

  @Test
  void saveBook() {
    Book book = new Book();
    book.setName("js");
    book.setTitle("js");
    bookDao.insert(book);
  }

  @Test
  void selectPage() {
    IPage page = new Page(1, 2);
    LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<Book>();
    qw.like(Book::getName, "js%");
    bookDao.selectPage(page, qw);
  }
}
