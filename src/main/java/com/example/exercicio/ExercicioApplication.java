package com.example.exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	@GetMapping("/habilities")
	public String habilities() {
		return ("Atenção aos detalhes, perseverança e orientação ao futuro.");
	}

	@GetMapping("/week-goals")
	public String goals() {
		return ("Compreender as bases de banco de dados e SpringBoot.");
	}
}