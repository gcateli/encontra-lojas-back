package com.magalu.finder.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magalu.finder.app.model.Produto;
import com.magalu.finder.app.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public List<Produto> buscaProdutos(String descricao) {
		return produtoRepository.buscaProdutos(descricao);
	}

	public Produto buscaProduto(int codProduto) {
		return produtoRepository.buscaProduto(codProduto);
	}

}
