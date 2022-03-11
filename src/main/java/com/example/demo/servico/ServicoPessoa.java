package com.example.demo.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelos.Pessoa;

@Service
public class ServicoPessoa {

	String data;
	ArrayList<String> palavras = new ArrayList<String>();
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public List<Pessoa> addPessoa(Pessoa pessoa) {
		System.out.println(pessoa);
		listaPessoas.add(pessoa);
		return listaPessoas;
	}
	
    public List<Pessoa> deletePessoa(String id){
    	System.out.println(id);
    	listaPessoas.remove(id);
    	return listaPessoas;
    }
    
    public List<Pessoa> updatePessoa(Pessoa p){
    	System.out.println(p);
    	listaPessoas.add(p);
        //return listaPessoas;
        try {
        	
        }
        catch(Exception e){
        	
        }
    }
}
