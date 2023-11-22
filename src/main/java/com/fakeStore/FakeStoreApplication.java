package com.fakeStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class FakeStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(FakeStoreApplication.class, args);
	}

}
