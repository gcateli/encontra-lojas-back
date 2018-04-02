package com.magalu.finder.app.repository;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.magalu.finder.app.google.api.ResponseApi;
import com.magalu.finder.app.model.Filial;

@Repository
public class FilialRepository {

	private static final String QUERY_FILIAL = "SELECT CODFIL,DESCRICAO, CEP, ATIVO FROM CAD_FILIAL WHERE CODFIL = ?";

	@Value("${app.query.selectprodutofiliais}")
	private String QUERY_FILIAIS_PRODUTO;

	@Autowired
	@Qualifier("mysql")
	private DataSource dataSource;

	public List<Filial> buscaFilial(int codFil) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		return jdbcTemplate.query(QUERY_FILIAL, ps -> ps.setInt(1, codFil), (ResultSet rs, int rowNum) -> {
			Filial filial = new Filial();
			filial.setCodFil(rs.getInt("CODFIL"));
			filial.setDescricao(rs.getString("DESCRICAO"));
			filial.setCep(rs.getString("CEP"));

			return filial;

		});
	}

	public List<Filial> buscaFiliaisPorProduto(int codProduto, String cepOrigem) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		return jdbcTemplate.query(QUERY_FILIAIS_PRODUTO, ps -> ps.setInt(1, codProduto), (ResultSet rs, int rowNum) -> {
			Filial filial = new Filial();

			filial.setCodFil(rs.getInt("CODFIL"));
			filial.setDescricao(rs.getString("DESCRICAO"));
			filial.setCep(rs.getString("CEP"));
			filial.setDistancia(run(cepOrigem, rs.getString("CEP")));

			return filial;

		});
	}

	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public String run(String cepOrigem, String cepDestino) {
		RestTemplate restTemplate = new RestTemplate();
		String url = String.format(
				"https://maps.googleapis.com/maps/api/distancematrix/json?origins=%s&destinations=%s&pt-BR&key=AIzaSyAjGtLDsF4sriJupnhoq-GtH5FscYnKvLQ",
				cepOrigem, cepDestino);

		ResponseApi responseApi = restTemplate.getForObject(url, ResponseApi.class);
		return responseApi.getRows().toString();
	}

}
