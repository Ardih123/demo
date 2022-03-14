package com.example.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")

public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(mappedBy="Empresa")
	private List<Pessoa> listaPessoas;
	private String nome, morada;
	private int numeroFuncionariosAtual, numeroFuncionariosDesdeCriacao, empresaId;
	private static int idEmpresa = 0;
	
	public Empresa(String nome, String morada, List<Pessoa> listaPessoas) {
		this.nome = nome;
		this.morada = morada;
		listaPessoas = new ArrayList<Pessoa>();
		empresaId = idEmpresa++;
		numeroFuncionariosAtual = listaPessoas.size();
	}

	public int getEmpresaId() {
		return empresaId;
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public int getNumeroFuncionariosAtual() {
		return numeroFuncionariosAtual;
	}

	public int getNumeroFuncionariosDesdeCriacao() {
		return numeroFuncionariosDesdeCriacao;
	}

	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	@Override
	public String toString() {
		return "{\r\n"
				+ "    \"nome\": "+ getNome() +",\r\n"
				+ "    \"morada\": "+ getMorada() +",\r\n"
				+ "    \"numeroFuncionariosAtual\": "+ getNumeroFuncionariosAtual() +",\r\n"
				+ "    \"numeroFuncionariosDesdeCriacao\": "+ getNumeroFuncionariosDesdeCriacao() +",\r\n"
				+ "    \"empresaId\": "+ getEmpresaId() +",\r\n"
				+ "    \"listaPessoas\": "+ getListaPessoas() +"\r\n"
				+ "}";
	}
	
	
}
