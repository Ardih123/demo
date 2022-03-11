package com.example.demo.controladores;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.Pessoa;
import com.example.demo.servico.ServicoPessoa;

@RestController
public class ControladorPessoa {
	private final ServicoPessoa servicoPessoa;
	
	@Autowired
	public ControladorPessoa(ServicoPessoa servicoPessoa) {
		this.servicoPessoa = servicoPessoa;
	}
    
	/*
	 * +/addPessoa
	 * +/updatePessoa
	 * +/deletePessoa/{id}
	 * +/getAllPessoas
	 * +/getPessoaById/{id}
	 * 
	 */
	
    @PostMapping("/addPessoa")
    public List<Pessoa> addPessoa(@RequestBody Pessoa pessoa){
    	if(pessoa.getNome() == null || pessoa.getNome().isBlank()) {
    		return Collections.emptyList();
    	}
    	
    	List<Pessoa> ppl = servicoPessoa.addPessoa(pessoa);
    	return ppl;
    }
    
    @PutMapping("/updatePessoa")
    public String updatePessoa(@RequestBody Pessoa pessoa){
    	String ppl = servicoPessoa.updatePessoa(pessoa);
    	return ppl;
    }
    
    @DeleteMapping("/deletePessoa/{id}")
    public String deletePessoa(@PathVariable String id){
    	String ppl = servicoPessoa.deletePessoa(id);
    	return ppl;
    }

    @GetMapping("/getAllPessoas")
    public List<Pessoa> getAllPessoas() {
    	return servicoPessoa.getAllPessoas();
    }
    
    @GetMapping("/getPessoaById/{id}")
    public String getPessoasById(@PathVariable String id) {
    	return servicoPessoa.getPessoaById(id);
    }
}
