package com.treinamento.service;

import com.treinamento.model.Pessoa;
import com.treinamento.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;

	public Optional criarPessoa(Pessoa pessoa){

		if(pessoaRepository.findById(pessoa.getCodigo()).isPresent()){
			return null;
		}else{
			pessoaRepository.save(pessoa);
			return pessoaRepository.findById(pessoa.getCodigo());
		}
	}

	public List<Pessoa> getPessoas(){
		return pessoaRepository.findAll();
	}

	public Optional<Pessoa> getPessoa(Long codigo){
		return pessoaRepository.findById(codigo);
	}

	public Optional<Pessoa> deletePessoa(Long codigo){
		pessoaRepository.deleteById(codigo);
		return pessoaRepository.findById(codigo);
	}

	public Optional<Pessoa> mudarPessoa(Long codigo, Pessoa novaPessoa){
		Optional actual = pessoaRepository.findById(codigo);
		if(!actual.isPresent()) return actual;

		pessoaRepository.save(novaPessoa);
		return pessoaRepository.findById(novaPessoa.getCodigo());
	}
}
