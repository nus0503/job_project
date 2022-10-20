package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.example.*"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) 	//디비 연동전에 임시로 넣는 코드

public class DemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);
	}

}
