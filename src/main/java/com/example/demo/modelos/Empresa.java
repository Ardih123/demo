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
@Table(name = "Empresa")
@IdClass(Empresa.class)

public class Empresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresaId")
	private int empresaId;
	
	//@OneToMany(mappedBy="Empresa")
	//private List<Pessoa> listaPessoas;
	
	@Id
    @Column(name = "nome")
	private String nome;
	
	@Id
    @Column(name = "morada")
	private String morada;
	
	@Id
    @Column(name = "numeroFuncionariosAtual")
	private int numeroFuncionariosAtual;
	
	@Id
    @Column(name = "numeroFuncionariosDesdeCriacao")
	private int numeroFuncionariosDesdeCriacao;
	
	//private static int idEmpresa;
	
	/*
	 * public Empresa(String nome, String morada, List<Pessoa> listaPessoas) {
	 * this.nome = nome; this.morada = morada; listaPessoas = new
	 * ArrayList<Pessoa>(); empresaId = idEmpresa++; numeroFuncionariosAtual =
	 * listaPessoas.size(); }
	 */

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

	/*
	 * public List<Pessoa> getListaPessoas() { return listaPessoas; }
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	/*
	 * @Override public String toString() { return "{\r\n" + "    \"nome\": "+
	 * getNome() +",\r\n" + "    \"morada\": "+ getMorada() +",\r\n" +
	 * "    \"numeroFuncionariosAtual\": "+ getNumeroFuncionariosAtual() +",\r\n" +
	 * "    \"numeroFuncionariosDesdeCriacao\": "+
	 * getNumeroFuncionariosDesdeCriacao() +",\r\n" + "    \"empresaId\": "+
	 * getEmpresaId() +",\r\n" + "    \"listaPessoas\": "+ getListaPessoas() +"\r\n"
	 * + "}"; }
	 */
	
	
}
