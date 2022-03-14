package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelos.Pessoa;

public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>{

}
