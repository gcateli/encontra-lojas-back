package com.magalu.finder.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magalu.finder.app.model.ProdutoDTO;
import com.magalu.finder.app.repository.ProdutoDTORepository;

@Service
public class ProdutoDTOService {
	
	@Autowired
	ProdutoDTORepository produtoDTORepository;
	
	public ProdutoDTO buscaProdutoFiliais(int codProd,String cep) {
		return produtoDTORepository.buscaProdutoFiliais(codProd,cep);
	}
}
