package br.com.appbarmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TUsuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	
	public Usuario() {
	}	
	public Usuario(String nome, String login, String senha) {
		this();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	public Usuario(Integer id, String nome, String login, String senha) {
		this(nome, login, senha);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s - %s", 
					this.getId(),
					this.getNome(),
					this.getLogin(),
					this.getSenha()
				);
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
