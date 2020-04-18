package br.com.appbarmvc.model.negocio;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "TPetisco")
@PrimaryKeyJoinColumn(name = "idProduto")

public class Petisco extends Produto {
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "Validade", nullable = false)
	private LocalDate validade;

	@Column(name = "Tipo", length = 100, nullable = false)
	private String tipo;
	@Column(name = "FeitoHoje", nullable = false)
	private boolean isFeitoHoje;	

	public Petisco()	{
		super();
	}


	
	public Petisco(LocalDate validade, String tipo, boolean isFeitoHoje) {
		super();
		this.setValidade(validade);
		this.setTipo(tipo);
		this.setFeitoHoje(isFeitoHoje);
	}

	@Override
	public String toString() {
		return "Petisco -> tipo=" + this.getTipo() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHoje;
	}	
	
	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isFeitoHoje() {
		return isFeitoHoje;
	}

	public void setFeitoHoje(boolean isFeitoHoje) {
		this.isFeitoHoje = isFeitoHoje;
	}	

}
