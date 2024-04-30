package com.fiserv.payment360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.fiserv.payment360.repository")
public class UserProfileMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileMicroServiceApplication.class, args);
	}

}
