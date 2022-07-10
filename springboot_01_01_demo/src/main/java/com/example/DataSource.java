package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("datasource")
public class DataSource {

  private String username;
  private Integer password;

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(Integer password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "dataSource{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  public String getUsername() {
    return username;
  }

  public Integer getPassword() {
    return password;
  }
}
