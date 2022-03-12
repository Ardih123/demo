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
	 * +/addEmpresa 
	 * +/updateEmpresa 
	 * +/deleteEmpresaById/{id} 
	 * +/getAllEmpresas
	 * +/getEmpresaById/{id}
	 * 
	 */

	@PostMapping("/addEmpresa")
    public List<Empresa> addEmpresa(@RequestBody Empresa aEmpresa){
    	return servicoEmpresa.addEmpresa(aEmpresa);
    }
    
    @PutMapping("/updateEmpresa")
    public String updateEmpresa(@RequestBody Empresa aEmpresa){
    	return servicoEmpresa.updateEmpresa(aEmpresa);
    }
    
    @DeleteMapping("/deleteEmpresaById/{id}")
    public String deleteEmpresaById(@PathVariable String aId){
    	return servicoEmpresa.deleteById(aId);
    }

    @GetMapping("/getAllEmpresas")
    public List<Empresa> getAllEmpresas() {
    	return servicoEmpresa.getAllEmpresas();
    }
    
    @GetMapping("/getEmpresaById/{id}")
    public String getEmpresaById(@PathVariable String aId) {
    	return servicoEmpresa.getEmpresaById(aId);
    }
	
}
