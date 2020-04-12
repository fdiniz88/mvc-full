package br.com.appbarmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;





@Entity
@Table(name = "TBebida")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Bebida extends Produto {
	
	
	private String tipo;
	private String marca;
	private Integer tamanho;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto", nullable = false)
	@MapsId
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Produto produto;

	/*
	 * public Bebida(Integer id, String nome, Integer quantidade, Float preco,
	 * String tipo, String marca, Integer tamanho) { super(id, nome, quantidade,
	 * preco); this.setId(id); this.setNome(nome); this.setQuantidade(quantidade);
	 * this.setPreco(preco); this.tipo = tipo; this.marca = marca; this.tamanho =
	 * tamanho; }
	 */
	public Bebida()	{
	super();
	}

	public Bebida(Integer id,String nome) {
		
		
		
		super(id, nome);
	}
	
	

	@Override
	public String toString() {
		return "Bebida -> nome=" + this.getNome() 
				+ ", quantidade=" + this.getQuantidade() 
				+ ", pre�o=" + this.getPreco()
				+ ", tipo=" + this.getTipo() 
				+ ", marca="	+ this.getMarca() 
				+ ", tamanho=" + this.getTamanho();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}