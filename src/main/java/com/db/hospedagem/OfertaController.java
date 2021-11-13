package com.db.hospedagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/swagger-ui")
public class OfertaController {

	@Autowired
	private OfertaRepository repository;
	
	@RequestMapping(value = "/{cidade}", method = RequestMethod.GET, produces = "application/json")
    public Oferta getCidade(@PathVariable("cidade") String cidade) {
		Oferta of = this.repository.findByCidade(cidade);
		return of;
    }
}