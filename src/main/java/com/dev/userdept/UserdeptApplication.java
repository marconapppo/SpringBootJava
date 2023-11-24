package com.dev.userdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EntityScan(basePackages = "Entities")
@EnableJpaRepositories("Infra")
@ComponentScan(basePackages = "Controllers")
public class UserdeptApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(UserdeptApplication.class, args);
	}

}
