package com.example.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

  @ExceptionHandler
  public CommonResult doException(Exception ex) {
    ex.printStackTrace();
    return new CommonResult(-999, "system Error", ex);
  }
}
