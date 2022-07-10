package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;

import java.util.List;

public interface BookService {
  Boolean save(Book book);
  Boolean update(Book book);
  Boolean delete(Integer id);
  List<Book> getAll();
  IPage<Book> getPage(Page page, QueryWrapper qw);
}
