package com.OC.librarybatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LibraryBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBatchApplication.class, args);
	}

}
