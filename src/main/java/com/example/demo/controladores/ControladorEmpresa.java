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

import com.example.demo.modelos.Empresa;
import com.example.demo.servico.ServicoEmpresa;

@RestController
public class ControladorEmpresa {
	private final ServicoEmpresa servicoEmpresa;
	
	@Autowired
	public ControladorEmpresa(ServicoEmpresa servicoEmpresa) {
		this.servicoEmpresa = servicoEmpresa;
	}
	
	/*
	 * /addEmpresa 
	 * /updateEmpresa 
	 * /deleteEmpresaById/{id} 
	 * /getAllEmpresas
	 * /getEmpresaById/{id}
	 * 
	 */

	@PostMapping("/addEmpresa")
    public List<Empresa> addEmpresa(@RequestBody Empresa empresa){
    	if(empresa.getNome() == null || empresa.getNome().isBlank()) {
    		return Collections.emptyList();
    	}
    	
    	List<Empresa> emp = servicoEmpresa.addEmpresa(empresa);
    	return emp;
    }
    
    @PutMapping("/updateEmpresa")
    public String updateEmpresa(@RequestBody Empresa empresa){
    	String emp = servicoEmpresa.updateEmpresa(empresa);
    	return emp;
    }
    
    @DeleteMapping("/deleteEmpresaById/{id}")
    public String deleteEmpresaById(@PathVariable String id){
    	String emp = servicoEmpresa.deleteById(id);
    	return emp;
    }

    @GetMapping("/getAllEmpresas")
    public List<Empresa> getAllEmpresas() {
    	return servicoEmpresa.getAllEmpresas();
    }
    
    @GetMapping("/getEmpresaById/{id}")
    public String getEmpresaById(@PathVariable String id) {
    	return servicoEmpresa.getEmpresaById(id);
    }
	
}
