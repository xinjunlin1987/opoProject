package com.example.opoproject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.opoproject.mapper")
public class OpoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpoProjectApplication.class, args);
    }

}
