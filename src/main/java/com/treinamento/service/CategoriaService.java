package com.treinamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.treinamento.model.Categoria;
import com.treinamento.repository.CategoriaRepository;
import com.treinamento.resource.CategoriaResource;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Categoria criarCategoria(Categoria ct) {
		return categoriaRepository.save(ct);
	}

	public Categoria mudarCategoria(Categoria novaCat) {
		return categoriaRepository.save(novaCat);
	}

	public Optional<Categoria> getById(Long id) {
		return categoriaRepository.findById(id);
	}

	public void deleteCategoria(Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
}
