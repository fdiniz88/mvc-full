package br.com.appbarmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer idade;
	private String genero;	
	
	public Cliente() {	
	}
	
	public Cliente(Integer id, String nome, Integer idade, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Cliente -> nome=" + this.getNome() + ", idade=" + this.getIdade() + ", g�nero=" + this.getGenero();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}