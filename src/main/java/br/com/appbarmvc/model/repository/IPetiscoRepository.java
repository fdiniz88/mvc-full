package br.com.appbarmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.appbarmvc.model.negocio.Petisco;

@Repository
public interface IPetiscoRepository extends CrudRepository<Petisco, Integer> {

}