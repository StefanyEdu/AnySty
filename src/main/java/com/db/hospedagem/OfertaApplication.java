package com.db.hospedagem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OfertaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfertaApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner com(OfertaRepository ofertarepository) {
		return(args)->{
				
			ofertarepository.save(new Oferta("Apartamento", "100.00", "Dezembro e Janeiro","100.00",
					"Porto Alegre","Rio Grande do Sul","2"));
				
			ofertarepository.save(new Oferta("Casa", "150.00", "Dezembro e Janeiro","100.00",
					"Porto Alegre","Rio Grande do Sul","1"));
			ofertarepository.save(new Oferta("Apartamento", "100.00", "Dezembro e Janeiro","100.00",
					"Porto Alegre","Rio Grande do Sul","2"));
			
		};
	}
	
}


