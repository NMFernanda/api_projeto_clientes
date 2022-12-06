package br.dev.duo.cidades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import br.dev.duo.cidades.model.Cidade;
import br.dev.duo.cidades.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, Integer>{
	public List<Cliente> findByCidade(Integer cidade);
}
