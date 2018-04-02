package com.magalu.finder.app.repository;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.magalu.finder.app.model.Produto;

@Repository
public class ProdutoRepository {

	private static final String QUERY_PRODUTOS = "SELECT CODPROD, DESCRICAO, PRECO FROM CAD_PRODUTO WHERE DESCRICAO LIKE UPPER(?)";
	private static final String QUERY_PRODUTO = "SELECT CODPROD, DESCRICAO, PRECO FROM CAD_PRODUTO WHERE CODPROD =?";
	@Autowired
	@Qualifier("mysql")
	private DataSource dataSource;

	public List<Produto> buscaProdutos(String descricao) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		return jdbcTemplate.query(QUERY_PRODUTOS, ps -> ps.setString(1, descricao + "%"), (ResultSet rs, int rowNum) -> {
			Produto produto = new Produto();
			produto.setCodProd(rs.getInt("CODPROD"));
			produto.setDescricao(rs.getString("DESCRICAO"));
			produto.setPreco(rs.getBigDecimal("PRECO"));

			return produto;

		});

	}

	public Produto buscaProduto(int codProduto) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject(QUERY_PRODUTO, new Object[] { codProduto },
				new BeanPropertyRowMapper<Produto>(Produto.class));
	}
}
