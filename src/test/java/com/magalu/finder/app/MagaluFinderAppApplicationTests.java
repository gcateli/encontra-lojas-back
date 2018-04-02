package com.magalu.finder.app;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.magalu.finder.app.model.Filial;
import com.magalu.finder.app.model.Produto;
import com.magalu.finder.app.service.FilialService;
import com.magalu.finder.app.service.ProdutoDTOService;
import com.magalu.finder.app.service.ProdutoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MagaluFinderAppApplicationTests {

	@Autowired
	FilialService filialService;

	@Autowired
	ProdutoService produtoService;
	
	@Autowired
	ProdutoDTOService produtoDTOService; 

	@Test
	public void pesquisaFilial() {
		List<Filial> filial = filialService.buscaFilial(1);
		for (Filial filiais : filial) {
			System.out.println(filiais.toString());
		}
	}

	@Test
	public void pesquisaProdutos() {
		String produtoDescricao = "CAFETEIRA";
		List<Produto> produto = produtoService.buscaProdutos(produtoDescricao);
		for (Produto produtos : produto) {
			System.out.println(produtos.toString());
		}
	}
	
	@Test
	public void pesquisaProdutoFiliais() {
		int codProd = 1;
		String cep = "14409-216";
		System.out.println(produtoDTOService.buscaProdutoFiliais(codProd, cep).toString());
	}
		
}
