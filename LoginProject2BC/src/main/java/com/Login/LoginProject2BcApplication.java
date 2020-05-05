package com.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Login.cts.project2bc.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class LoginProject2BcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginProject2BcApplication.class, args);
	}

}
