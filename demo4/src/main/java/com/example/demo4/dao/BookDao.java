package com.example.demo4.dao;

import com.example.demo4.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
  @Select("select * from book where id = #{id}")
  public Book getById(Integer id);
}
