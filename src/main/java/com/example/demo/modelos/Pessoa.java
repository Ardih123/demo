package com.example.demo.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
@IdClass(Pessoa.class)

public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	//@ManyToOne
	private int id;
	//private static int ids;
	
	@Id
    @Column(name = "nome")
	private String nome;
	
	@Id
    @Column(name = "idade")
	private int idade;
	
	/*
	 * public Pessoa(String nome, int idade) { super(); this.nome = nome; this.idade
	 * = idade; this.id = ids++; }
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{\r\n"
				+ "    \"id\": "+ getId() +",\r\n"
				+ "    \"nome\": "+ getNome() +",\r\n"
				+ "    \"idade\": "+ getIdade() +"\r\n"
				+ "}";
	}
	
}
