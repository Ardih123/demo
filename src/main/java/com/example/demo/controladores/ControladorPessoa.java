package com.example.demo.controladores;

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
    public List<Pessoa> addPessoa(@RequestBody Pessoa aPessoa){  	
    	return servicoPessoa.addPessoa(aPessoa);
    }
    
    @PutMapping("/updatePessoa")
    public String updatePessoa(@RequestBody Pessoa aPessoa){
    	return servicoPessoa.updatePessoa(aPessoa);
    }
    
    @DeleteMapping("/deletePessoa/{id}")
    public String deletePessoa(@PathVariable String aId){
    	return servicoPessoa.deletePessoa(aId);
    }

    @GetMapping("/getAllPessoas")
    public List<Pessoa> getAllPessoas() {
    	return servicoPessoa.getAllPessoas();
    }
    
    @GetMapping("/getPessoaById/{id}")
    public String getPessoasById(@PathVariable String aId) {
    	return servicoPessoa.getPessoaById(aId);
    }
}
