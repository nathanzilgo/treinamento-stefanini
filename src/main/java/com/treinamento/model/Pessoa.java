package com.treinamento.model;

import com.sun.xml.internal.ws.developer.Serialization;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private boolean ativo;
	private String nome;
	@Embedded
	private Endereco endereco;

	/*
	public Pessoa(Long codigo, boolean ativo, String nome) {
		this.codigo = codigo;
		this.ativo = ativo;
		this.nome = nome;
	}

	public Pessoa(Long codigo, boolean ativo, String nome, Endereco endereco) {
		this.codigo = codigo;
		this.ativo = ativo;
		this.nome = nome;
		this.endereco = endereco;
	}

	 */

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pessoa pessoa = (Pessoa) o;
		return
			codigo.equals(pessoa.codigo);

	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, ativo, nome, endereco);
	}
}
