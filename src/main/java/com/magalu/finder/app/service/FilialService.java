package com.magalu.finder.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magalu.finder.app.model.Filial;
import com.magalu.finder.app.repository.FilialRepository;

@Service
public class FilialService {

	@Autowired
	FilialRepository filialRepository;

	public List<Filial> buscaFilial(int codFil) {
		return filialRepository.buscaFilial(codFil);
	}
}
