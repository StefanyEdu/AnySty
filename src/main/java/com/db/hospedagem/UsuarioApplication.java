package com.db.hospedagem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class UsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioApplication.class, args);
		
}
	
	
	@Bean
	public CommandLineRunner com(UsuarioRepository repository) {
		return (args)->{
			repository.save(new Usuario());
		};
		
}
}