package com.dev.userdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Entities")
public class UserdeptApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(UserdeptApplication.class, args);
	}

}
