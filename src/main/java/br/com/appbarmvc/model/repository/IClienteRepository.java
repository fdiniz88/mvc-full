package br.com.appbarmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.appbarmvc.model.negocio.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}