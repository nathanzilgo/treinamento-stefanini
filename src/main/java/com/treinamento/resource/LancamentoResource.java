package com.treinamento.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.model.Lancamento;
import com.treinamento.service.LancamentoService;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@GetMapping
	public ResponseEntity getAllLancamento() {
		return new ResponseEntity(lancamentoService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getById(@PathVariable Long id) {
		return new ResponseEntity(lancamentoService.getById(id), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity postLancamento(@RequestBody Lancamento novo) {
		return new ResponseEntity(lancamentoService.postLancamento(novo), HttpStatus.CREATED);
	}
}
