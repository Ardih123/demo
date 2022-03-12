package com.example.demo.modelos;

public class Pessoa {

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
