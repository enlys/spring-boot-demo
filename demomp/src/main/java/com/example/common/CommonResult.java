package com.example.common;

import lombok.Data;

@Data
public class CommonResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static CommonResult success() {
    return  CommonResult.success(null);
  }

  public static <T> CommonResult<T> success(T data) {
    return new CommonResult(0, "ok", data);
  }

}
