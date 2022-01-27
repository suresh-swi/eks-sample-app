package com.leaninnovationslab.ekssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EkssampleApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/eks-sample");
		SpringApplication.run(EkssampleApplication.class, args);
	}

}
