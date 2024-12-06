package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootThymeleafEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafEmployeeApplication.class, args);
	}

}