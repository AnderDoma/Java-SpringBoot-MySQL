package com.br.saude.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "PLANO")
public class Plano {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "TIPO", nullable = false, unique = true)
    private String tipoPlano;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipoPlano;
	}

	public void setTipo(String tipo) {
		this.tipoPlano = tipo;
	}

}
