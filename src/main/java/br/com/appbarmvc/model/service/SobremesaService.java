package br.com.appbarmvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appbarmvc.model.negocio.Sobremesa;
import br.com.appbarmvc.model.repository.ISobremesaRepository;


@Service
public class SobremesaService {
	
	@Autowired
	private ISobremesaRepository repository;

	public List<Sobremesa> obterLista(){
		return (List<Sobremesa>)repository.findAll();
	}
	
	public Optional<Sobremesa> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Sobremesa Sobremesa) {
		repository.save(Sobremesa);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ISobremesaRepository getRepository() {
		return repository;
	}
	public void setRepository(ISobremesaRepository repository) {
		this.repository = repository;
	}
}
