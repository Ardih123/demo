package com.example.demo.servico;

import java.util.ArrayList;
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
	
	public List<Pessoa> addPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
		return listaPessoas;
	}
	
    public String updatePessoa(Pessoa p){
    	for (Pessoa pessoaAux: listaPessoas) {
            if (pessoaAux.getId() == p.getId()) {
                if(p.getIdade() > 0){
                    pessoaAux.setIdade(p.getIdade());
                }

                if (p.getNome()!= null && !p.getNome().isBlank()){
                    pessoaAux.setNome(p.getNome());
                }

                return "id encontrado";
            }
        }

        return "Pessoa nao existe";
    }
    
    public String deletePessoa(String id){
    	Integer idPessoa = Integer.valueOf(id);
    	for(Pessoa ppl : listaPessoas) {
    		if(ppl.getId() == idPessoa) {
    			listaPessoas.remove(ppl);
    			return "pessoa removida";
    		}
    	}
    	return "id nao encontrado";
    }
    
    public List<Pessoa> getAllPessoas() {
    	return listaPessoas;
    }
    
    public String getPessoaById(String id) {
    	Integer idPessoa = Integer.valueOf(id);
    	for(Pessoa ppl : listaPessoas) {
    		if(ppl.getId() == idPessoa) {
    			return ppl.toString();
    		}
    	}
    	return "erro no id";
    }
    
}
