package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
//@MapperScan(value = {"com.example.demo.mapper"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {

		Test test = new Test();
		test.setUserName("홍길동");
		String data = test.getUserName();
		System.out.println(data);
		log.debug("Logging - Debug log");
		log.info("Logging - Info log");
		log.warn("Logging - Warn log");
		log.error("Logging - Error log");
		SpringApplication.run(DemoApplication.class, args);
	}

}
