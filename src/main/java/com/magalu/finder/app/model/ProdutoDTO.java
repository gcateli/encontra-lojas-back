package com.magalu.finder.app.model;

import java.util.Comparator;
import java.util.List;

public class ProdutoDTO {
	
	private Produto produto;
	private List<Filial> filiais;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public List<Filial> getFiliais() {
		return filiais;
	}
	public void setFiliais(List<Filial> filiais) {
		this.filiais = filiais;
		this.filiais.sort(Comparator.comparing(Filial::getDistancia));
	}
	
	

}
