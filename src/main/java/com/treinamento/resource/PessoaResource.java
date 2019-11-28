package com.treinamento.resource;

import com.treinamento.model.Pessoa;
import com.treinamento.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	private ResponseEntity getPessoas(){
		return new ResponseEntity(pessoaService.getPessoas(), HttpStatus.OK);
	}

	@PostMapping
	private ResponseEntity createPessoa(@RequestBody Pessoa novaPessoa){
		if(pessoaService.criarPessoa(novaPessoa).isPresent()){
			return new ResponseEntity(HttpStatus.CREATED);
		}else{
			return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@PutMapping("/{id]")
	private ResponseEntity mudarPessoa(@PathVariable Long id, @RequestBody Pessoa novaPessoa){
		if(pessoaService.getPessoa(id).isPresent()){
			return new ResponseEntity(pessoaService.mudarPessoa(id, novaPessoa).get(), HttpStatus.OK);
		}else{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/{id}")
	private ResponseEntity getPessoa(@PathVariable Long id){
		if(pessoaService.getPessoa(id).isPresent()){
			return new ResponseEntity(pessoaService.getPessoa(id), HttpStatus.OK);
		}else{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
}
