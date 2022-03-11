package com.example.demo.controladores;

import java.util.ArrayList;
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
    
    @PostMapping("/addPessoa")
    public List<Pessoa> addPessoa(@RequestBody Pessoa pessoa){
    	if(pessoa.getNome() != null || pessoa.getNome().isBlank()) {
    		return Collections.emptyList();
    	}
    	
    	List<Pessoa> ppl = servicoPessoa.addPessoa(pessoa);
    	return ppl;
    }
    
    @DeleteMapping("/deletePessoa/{id}")
    public String deletePessoa(@PathVariable String id){
    	if(pessoa.getNome() != null || pessoa.getNome().isBlank()) {
    		return Collections.emptyList();
    	}
    	
    	List<Pessoa> ppl = servicoPessoa.addPessoa(pessoa);
    	return ppl;
    }
    
    @PutMapping("/updatePessoa")
    public String updatePessoa(@RequestBody Pessoa p){
        for (Pessoa pessoaAux: pessoa) {
            if (pessoaAux.getId() == p.getId()) {
                if(p.getIdade() > 0){
                    pessoaAux.setIdade(p.getIdade());
                    return "idade modificada";
                }

                if (p.getNome()!= null && !p.getNome().isBlank()){
                    pessoaAux.setNome(p.getNome());
                    return "nome modificado";
                }

                return "id encontrado";
            }
        }

        return "Pessoa nao existe";
    }
    
}
