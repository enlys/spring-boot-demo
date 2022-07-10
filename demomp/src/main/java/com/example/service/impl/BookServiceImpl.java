package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

  @Autowired
  private BookDao bookDao;

  @Override
  public Boolean save(Book book) {
    return bookDao.insert(book) > 0;
  }

  @Override
  public Boolean update(Book book) {
    return bookDao.updateById(book) > 0;
  }

  @Override
  public Boolean delete(Integer id) {
    return bookDao.deleteById(id) > 0;
  }

  @Override
  public List<Book> getAll() {
    return bookDao.selectList(null);
  }

  @Override
  public IPage<Book> getPage(Page page, QueryWrapper qw) {
    return bookDao.selectPage(page, qw);
  }
}
