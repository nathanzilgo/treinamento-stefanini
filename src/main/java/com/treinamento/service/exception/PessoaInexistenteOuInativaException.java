package com.treinamento.service.exception;

public class PessoaInexistenteOuInativaException extends RuntimeException{

	public PessoaInexistenteOuInativaException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}
