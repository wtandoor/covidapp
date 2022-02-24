package io.wtmrb.wtmrbcovidapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WtmrbcovidappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WtmrbcovidappApplication.class, args);
	}
}
