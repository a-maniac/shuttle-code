package com.example.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	Apple apple;
//
//	@Autowired
//	Apple apple2;

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		apple.eatApple();
//		apple2.eatApple();
		//implement log rather than Sysout
		System.out.println(cakeBaker.bakeCake());
	}


}
