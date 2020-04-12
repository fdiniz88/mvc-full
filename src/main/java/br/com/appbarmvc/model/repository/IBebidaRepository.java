package br.com.appbarmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.appbarmvc.model.negocio.Bebida;


@Repository
public interface IBebidaRepository extends CrudRepository<Bebida, Integer> {

}