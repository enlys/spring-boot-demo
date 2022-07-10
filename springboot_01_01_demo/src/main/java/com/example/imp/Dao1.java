package com.example.imp;


import org.springframework.stereotype.Repository;

@Repository
public class Dao1  implements com.example.inter.Dao {
  @Override
  public void save() {
    System.out.println("running......");
  }
}
