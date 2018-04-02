package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.SpringConfig;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class BootApplication  {
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
