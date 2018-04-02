package com.magalu.finder.app.model;

public class Filial {

	private int codFil;
	private String descricao;
	private String cep;
	private String distancia;

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public int getCodFil() {
		return codFil;
	}

	public void setCodFil(int codFil) {
		this.codFil = codFil;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Filial [codFil=" + codFil + ", descricao=" + descricao + ", cep=" + cep + ", distancia=" + distancia
				+ "]";
	}

}
