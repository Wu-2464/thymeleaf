package cn.bdqn.thymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.thymeleaf.mapper")
public class ThymeleafApplication {

    public static void main(String[] args) { SpringApplication.run(ThymeleafApplication.class, args); }

}
