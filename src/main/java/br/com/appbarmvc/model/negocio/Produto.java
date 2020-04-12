package br.com.appbarmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoProduto")
@JsonSubTypes({ @JsonSubTypes.Type(value = Bebida.class, name = "bebida"),
@JsonSubTypes.Type(value = Petisco.class, name = "petisco"),
@JsonSubTypes.Type(value = Sobremesa.class, name = "sobremesa") })
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String nome;
	private Integer quantidade;	
	private Float preco;
	private String tipoProduto;

	//@ManyToOne
	//@JoinColumn(name = "idPedido")
	//@JsonBackReference
	//private Pedido pedido;
	
	public Produto() {		
	}
	
	public Produto(Integer id, String nome) {
	this();
		this.id = id;
		this.nome = nome;

	}

	@Override
	public String toString() {
		return "Produto nome=" + this.getNome() + ", quantidade=" + this.getQuantidade() + ", preço=" + this.getPreco();			
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
