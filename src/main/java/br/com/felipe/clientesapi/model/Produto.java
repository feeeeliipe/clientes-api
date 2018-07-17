package br.com.felipe.clientesapi.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	private BigDecimal precocompra;
	
	private BigDecimal precovenda;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPrecoCompra() {
		return precocompra;
	}

	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precocompra = precoCompra;
	}

	public BigDecimal getPrecoVenda() {
		return precovenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precovenda = precoVenda;
	}
}
