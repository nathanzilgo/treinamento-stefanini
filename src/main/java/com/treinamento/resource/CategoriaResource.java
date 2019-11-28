package com.treinamento.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.model.Categoria;
import com.treinamento.service.CategoriaService;

import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity listarCategorias() {
		return new ResponseEntity(categoriaService.getCategorias(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria ct) {
		return new ResponseEntity<Categoria>(categoriaService.criarCategoria(ct),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> mudarNome(@PathVariable Long id, @RequestBody Categoria novaCat){
		Optional<Categoria> busca = categoriaService.getById(id);

		if(busca.isPresent()){
			return new ResponseEntity<Categoria>(categoriaService.mudarCategoria(novaCat),HttpStatus.OK);
		}else{
			return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getById(@PathVariable Long id){
		Optional<Categoria> busca = categoriaService.getById(id);
		
		if(busca.isPresent()) {
			return new ResponseEntity(busca.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteById(@PathVariable Long id){
		Optional<Categoria> busca = categoriaService.getById(id);

		if(busca.isPresent()){
			categoriaService.deleteCategoria(busca.get());
			return new ResponseEntity(HttpStatus.OK);
		}else{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
}
