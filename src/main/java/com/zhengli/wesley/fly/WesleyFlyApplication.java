package com.zhengli.wesley.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WesleyFlyApplication {

	public static void main(String[] args) {

		SpringApplication.run(WesleyFlyApplication.class, args);
		System.out.println("args = [" + args + "]");
	}

}
