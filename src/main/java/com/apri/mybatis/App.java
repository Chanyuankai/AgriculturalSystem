package com.apri.mybatis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value={@ComponentScan("com.ari.config")})
@MapperScan("com.ari.mybatis.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
