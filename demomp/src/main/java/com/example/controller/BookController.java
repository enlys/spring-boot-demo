package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.CommonResult;
import com.example.domain.Book;
import com.example.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

//  @Autowired
  private IBookService bookService;

  @Autowired
  public void setBookService(IBookService bookService) {
    this.bookService = bookService;
  }

//  public static final Logger logger = LoggerFactory.getLogger(BookController.class);

  @GetMapping
  public CommonResult<List<Book>> getList() throws Exception {
//    if (true) {
//      throw new Exception();
//    }
    List<Book> list = bookService.list();
    return  CommonResult.success(list);
  }

  @PostMapping
  public CommonResult<Boolean> save(@RequestBody Book book) {
    log.info("save start:"+ book.toString());
//    Book book = new Book();
    Boolean flag =  bookService.save(book);
    return  CommonResult.success(flag);
  }

  @PutMapping
  public CommonResult<Boolean> update(@RequestBody Book book) {
//    Book book = new Book();
    Boolean flag =  bookService.updateById(book);
    return  CommonResult.success(flag);
  }

  @GetMapping("/all")
  public CommonResult<IPage<Book>> getAll(@RequestParam int current, @RequestParam  int size, String keyWord) {
    System.out.println("KEYWORD>>"+keyWord);
    System.out.println(size);
    IPage page = new Page(current, size);
    LambdaQueryWrapper<Book> qw =  new LambdaQueryWrapper<Book>();
    qw.like(Strings.isNotEmpty(keyWord), Book::getName, keyWord);
    bookService.page(page, qw);
    if(current > page.getPages()) {
      IPage page1 = new Page(page.getPages(), size);
      page = bookService.page(page1, qw);
    }
    return CommonResult.success(page);
  }
}




