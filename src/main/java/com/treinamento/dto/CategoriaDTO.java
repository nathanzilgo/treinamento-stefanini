package com.treinamento.dto;

public class CategoriaDTO {
	private String nome;
	private Long id;

	public CategoriaDTO(String nome, Long id) {
		this.nome = nome;
		this.id = id;
	}

	public CategoriaDTO(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
