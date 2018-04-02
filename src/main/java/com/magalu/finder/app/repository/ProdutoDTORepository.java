package com.magalu.finder.app.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.magalu.finder.app.model.ProdutoDTO;

@Repository
public class ProdutoDTORepository {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	FilialRepository filialRepository;
	
	
	public ProdutoDTO buscaProdutoFiliais(int codProd,String cep) {
		ProdutoDTO produtoDTO = new ProdutoDTO();
		
		produtoDTO.setProduto(produtoRepository.buscaProduto(codProd));
		produtoDTO.setFiliais(filialRepository.buscaFiliaisPorProduto(codProd,cep));
		return produtoDTO;
	}
}
