package org.nini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class Projet2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projet2Application.class, args);
	}

}
