package com.github.bernabaris.dayofweek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DayOfWeekApplication implements CommandLineRunner {

	@Autowired
	private DayOfWeekService service;

	public static void main(String[] args) {
		SpringApplication.run(DayOfWeekApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir rakam giriniz (1-7): ");
		int day = scanner.nextInt();

		System.out.println(service.DayOfWeekIf(day));
	}
}
