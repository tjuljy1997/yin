package com.example.yin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.example.yin.mapper")
public class YinMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(YinMusicApplication.class, args);
    }

}
