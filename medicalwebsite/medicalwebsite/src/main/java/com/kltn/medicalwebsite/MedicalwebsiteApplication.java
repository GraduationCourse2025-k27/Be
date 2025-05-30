package com.kltn.medicalwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MedicalwebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalwebsiteApplication.class, args);
	}

}
