package com.db.hospedagem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OfertaRepository extends CrudRepository<Oferta, String> {
		
		List<Oferta> findByImovel(String imovel);
		
		Oferta findByQuantQuartos(String quantQuartos);
		
		Oferta findByCidade(String cidade);
		
		Oferta findByUf(String uf);
        Oferta findByPreco(String preco);
        Oferta findByDisponibilidade(String disponibilidade);
        Oferta findByDiarias(String diarias);
        
	}