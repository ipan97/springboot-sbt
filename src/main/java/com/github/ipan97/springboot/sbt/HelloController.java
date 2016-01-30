package com.github.ipan97.springboot.sbt;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RestController;
  @RestController
public class HelloController{
  @RequestMapping("/")
  public String hello(){
    return "Hello Spring boot project with sbt";
  }

}
