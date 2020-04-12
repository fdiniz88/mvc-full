package br.com.appbarmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.appbarmvc.model.negocio.Sobremesa;



@Repository
public interface ISobremesaRepository extends CrudRepository<Sobremesa, Integer> {

}