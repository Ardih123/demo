package com.example.demo.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelos.Pessoa;

@Service
public class ServicoPessoa {

	/*
	 * +/addPessoa
	 * +/updatePessoa
	 * +/deletePessoa/{id}
	 * +/getAllPessoas
	 * +/getPessoaById/{id}
	 * 
	 */
	
	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public List<Pessoa> addPessoa(Pessoa aPessoa) {
		if(aPessoa.getNome() != null || !aPessoa.getNome().isBlank() || aPessoa.getIdade() > 0) {
			listaPessoas.add(aPessoa);
		}
		else {
			return Collections.emptyList();
		}
		return listaPessoas;
	}
	
    public String updatePessoa(Pessoa aPessoa){
    	for (Pessoa pessoaAux: listaPessoas) {
            if (pessoaAux.getId() == aPessoa.getId()) {
                if(aPessoa.getIdade() > 0){
                    pessoaAux.setIdade(aPessoa.getIdade());
                }
                if (aPessoa.getNome()!= null && !aPessoa.getNome().isBlank()){
                    pessoaAux.setNome(aPessoa.getNome());
                }
                return "id "+ pessoaAux.getId() +" modificado";
            }
        }
    	return "id "+ aPessoa.getId() +" não existe";
    }
    
    public String deletePessoa(String aId){
    	Integer idPessoa = Integer.valueOf(aId);
    	for(Pessoa pessoaAux : listaPessoas) {
    		if(pessoaAux.getId() == idPessoa) {
    			listaPessoas.remove(pessoaAux);
    			return "id "+ pessoaAux.getId() +" removido";
    		}
    	}
    	return "id "+ idPessoa +" não existe";
    }
    
    public List<Pessoa> getAllPessoas() {
    	return listaPessoas;
    }
    
    public String getPessoaById(String aId) {
    	Integer idPessoa = Integer.valueOf(aId);
    	for(Pessoa pessoaAux : listaPessoas) {
    		if(pessoaAux.getId() == idPessoa) {
    			return pessoaAux.toString();
    		}
    	}
    	return "id "+ idPessoa +" não existe";
    }
    
}
