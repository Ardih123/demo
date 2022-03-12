package com.example.demo.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelos.Empresa;

@Service
public class ServicoEmpresa {
	
	/*
	 * +/addEmpresa 
	 * +/updateEmpresa 
	 * +/deleteEmpresaById/{id} 
	 * +/getAllEmpresas
	 * +/getEmpresaById/{id}
	 * 
	 */

	List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	
	public List<Empresa> addEmpresa(Empresa aEmpresa) {
		if(aEmpresa.getNome() != null || !aEmpresa.getNome().isBlank() || aEmpresa.getMorada() != null || !aEmpresa.getMorada().isBlank()) {
			listaEmpresa.add(aEmpresa);
    	}
		else {
			return Collections.emptyList();
		}
		return listaEmpresa;
	}
	
	public String updateEmpresa(Empresa aEmpresa) {
		for(Empresa empresaAux : listaEmpresa) {
			if(empresaAux.getEmpresaId() == aEmpresa.getEmpresaId()) {
				if(aEmpresa.getNome() != null || !aEmpresa.getNome().isBlank()) {
					empresaAux.setNome(aEmpresa.getNome());
				}
				if(aEmpresa.getMorada() != null || !aEmpresa.getMorada().isBlank()) {
					empresaAux.setMorada(aEmpresa.getMorada());
				}
				return "empresa id "+ empresaAux.getEmpresaId() +" atualizada";
			}
			
		}
		return "empresa id "+ aEmpresa.getEmpresaId() +" não existe";
	}
	
	public String deleteById(String aId) {
    	Integer idEmpresa = Integer.valueOf(aId);
    	for(Empresa empresaAux : listaEmpresa) {
    		if(empresaAux.getEmpresaId() == idEmpresa) {
    			listaEmpresa.remove(empresaAux);
    			return "empresa id "+ empresaAux.getEmpresaId() +" removida";
    		}
    	}
    	return "empresa id "+ idEmpresa +" não existe";
	}
	
	public List<Empresa> getAllEmpresas(){
		return listaEmpresa;
	}
	
	public String getEmpresaById(String aId) {
    	Integer idEmpresa = Integer.valueOf(aId);
    	for(Empresa empresaAux : listaEmpresa) {
    		if(empresaAux.getEmpresaId() == idEmpresa) {
    			return empresaAux.toString();
    		}
    	}
    	return "empresa id "+ idEmpresa +" não existe";
	}
	
}
