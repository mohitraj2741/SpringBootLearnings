package com.learnspring.mohit.week1Intro.introToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.cakeBake();
	}
}
