package com.magalu.finder.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.magalu.finder.app.model.Produto;
import com.magalu.finder.app.model.ProdutoDTO;
import com.magalu.finder.app.service.ProdutoDTOService;
import com.magalu.finder.app.service.ProdutoService;

@RestController
public class ProdutoFilialController {

	@Autowired
	ProdutoService produtoService;

	@Autowired
	ProdutoDTOService produtoDTOService;

	@RequestMapping("/produto/{descricaoProduto}")
	public List<Produto> buscaProduto(@PathVariable String descricaoProduto) {
		return produtoService.buscaProdutos(descricaoProduto);
	}

	@RequestMapping("/produtofiliais/{codProd}")
	public ProdutoDTO buscaProdutoFiliais(@PathVariable int codProd,
			@RequestParam(value = "cep", defaultValue = "") String cep) {
		return produtoDTOService.buscaProdutoFiliais(codProd,cep);
	}

}
