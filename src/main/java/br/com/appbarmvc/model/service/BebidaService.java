package br.com.appbarmvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appbarmvc.model.negocio.Bebida;
import br.com.appbarmvc.model.repository.IBebidaRepository;



@Service
public class BebidaService {
	
	@Autowired
	private IBebidaRepository repository;

	public List<Bebida> obterLista(){
		return (List<Bebida>)repository.findAll();
	}
	
	public Optional<Bebida> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Bebida Bebida) {
		repository.save(Bebida);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IBebidaRepository getRepository() {
		return repository;
	}
	public void setRepository(IBebidaRepository repository) {
		this.repository = repository;
	}
}
