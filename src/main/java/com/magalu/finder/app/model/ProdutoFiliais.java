package com.magalu.finder.app.model;

import java.math.BigDecimal;

public class ProdutoFiliais {

	private int codFil;
	private String descricaoFilial;
	private BigDecimal preco;
	private String distancia;

	public int getCodFil() {
		return codFil;
	}

	public void setCodFil(int codFil) {
		this.codFil = codFil;
	}

	public String getDescricaoFilial() {
		return descricaoFilial;
	}

	public void setDescricaoFilial(String descricaoFilial) {
		this.descricaoFilial = descricaoFilial;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

}
