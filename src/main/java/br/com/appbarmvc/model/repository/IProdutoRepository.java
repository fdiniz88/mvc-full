package br.com.appbarmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.appbarmvc.model.negocio.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}