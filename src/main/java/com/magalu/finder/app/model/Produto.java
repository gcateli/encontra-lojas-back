package com.magalu.finder.app.model;

import java.math.BigDecimal;

public class Produto {

	private int codProd;
	private String descricao;
	private BigDecimal preco;

	public int getCodProd() {
		return this.codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + this.codProd + ", descricao=" + this.descricao + ", preco=" + this.preco + "]";
	}

}
