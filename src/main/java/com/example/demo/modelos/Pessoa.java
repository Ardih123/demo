package com.example.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	private int id = 0;
	private static int ids = 0;
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.id = ids++;
	}

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
