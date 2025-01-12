package com.jun.estudo.Date4u;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Date4uApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContexto = SpringApplication.run(Date4uApplication.class, args);
		
		Arrays.stream(appContexto.getBeanDefinitionNames()).sorted().forEach(System.out::println);
	}

}
