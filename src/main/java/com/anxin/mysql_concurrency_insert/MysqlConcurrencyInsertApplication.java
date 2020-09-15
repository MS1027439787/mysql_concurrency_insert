package com.anxin.mysql_concurrency_insert;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.anxin.mysql_concurrency_insert.mapper")
public class MysqlConcurrencyInsertApplication {
    public static void main(String[] args) {
        SpringApplication.run(MysqlConcurrencyInsertApplication.class, args);
    }

}
