package com.challenge.literalura.LiterAlura.by.israelFernando;

import com.challenge.literalura.LiterAlura.by.israelFernando.principal.Principal;
import com.challenge.literalura.LiterAlura.by.israelFernando.repository.IAutorRepository;
import com.challenge.literalura.LiterAlura.by.israelFernando.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraByIsraelFernandoApplication implements CommandLineRunner {

	@Autowired
	private IAutorRepository autorRepository;
	@Autowired
	private ILibrosRepository libroRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraByIsraelFernandoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal( autorRepository, libroRepository);
		principal.muestraMenu();
	}

}
