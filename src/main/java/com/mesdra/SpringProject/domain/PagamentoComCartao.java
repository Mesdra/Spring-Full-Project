package com.mesdra.SpringProject.domain;

import javax.persistence.Entity;

import com.mesdra.SpringProject.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numdeparcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numdeparcelas;
	}

}