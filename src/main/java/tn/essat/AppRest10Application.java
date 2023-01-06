package tn.essat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AppRest10Application {

	public static void main(String[] args) {
		SpringApplication.run(AppRest10Application.class, args);
	}

}
