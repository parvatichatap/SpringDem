package com.example.SpringDemo;

import com.example.SpringDemo.di.Company;
import com.example.SpringDemo.ioc.Jio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication

@RestController

public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Jio jio = context.getBean(Jio.class);
		jio.calling();

		Company company = context.getBean(Company.class);
		company.show();
	}

	@GetMapping("hello")
	public String hello() {
		return "Hello spring";
	}
}

