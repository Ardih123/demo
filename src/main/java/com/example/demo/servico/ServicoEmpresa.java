package com.example.demo.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelos.Empresa;

@Service
public class ServicoEmpresa {
	
	/*
	 * /addEmpresa 
	 * /updateEmpresa 
	 * /deleteEmpresaById/{id} 
	 * /getAllEmpresas
	 * /getEmpresaById/{id}
	 * 
	 */

	List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	
	public List<Empresa> addEmpresa(Empresa empresa) {
		listaEmpresa.add(empresa);
		return listaEmpresa;
	}
	
	public String updateEmpresa(Empresa e) {
		for(Empresa empresa : listaEmpresa) {
			if(empresa.getEmpresaId() == e.getEmpresaId()) {
				if(e.getNome() != null || !e.getNome().isBlank()) {
					empresa.setNome(e.getNome());
				}
				if(e.getMorada() != null || !e.getMorada().isBlank()) {
					empresa.setMorada(e.getMorada());
				}
				return "empresa atualizada";
			}
			
		}
		return "empresa nao existe";
	}
	
	public String deleteById(String id) {
    	Integer idEmpresa = Integer.valueOf(id);
    	for(Empresa empresa : listaEmpresa) {
    		if(empresa.getEmpresaId() == idEmpresa) {
    			listaEmpresa.remove(empresa);
    			return "empresa removida";
    		}
    	}
    	return "id nao encontrado";
	}
	
	public List<Empresa> getAllEmpresas(){
		return listaEmpresa;
	}
	
	public String getEmpresaById(String id) {
    	Integer idEmpresa = Integer.valueOf(id);
    	for(Empresa empresa : listaEmpresa) {
    		if(empresa.getEmpresaId() == idEmpresa) {
    			return empresa.toString();
    		}
    	}
    	return "id nao encontrado";
	}
	
}
