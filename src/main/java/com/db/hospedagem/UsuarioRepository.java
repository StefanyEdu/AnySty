package com.db.hospedagem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	List<Usuario> findByNome(String nome);
	Usuario findByEmail(String email);
	Usuario findByCpf(String cpf);
	Usuario findByTelefone(String telefone);



}
