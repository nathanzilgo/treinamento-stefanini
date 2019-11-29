package com.treinamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.model.Lancamento;
import com.treinamento.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Object getAll() {
		return lancamentoRepository.findAll();
	}
	
	public Object getById(Long id) {
		return lancamentoRepository.findById(id);
	}
	
	public Object postLancamento(Lancamento novo) {
		return lancamentoRepository.save(novo);
	}
}
