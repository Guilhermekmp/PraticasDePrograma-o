package com.gov.pocketmoney.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.gov.pocketmoney.models.Conta;
import com.gov.pocketmoney.repositories.ContaRepository;

@Service @Validated
public class ContaService {

	@Autowired
	public ContaRepository repo;
	
	public Conta createConta(Conta novaConta){
		
		return repo.save(novaConta);
	}
	
	public Conta getById(long id){
		return repo.findById(id).get();
	}
	
	public List<Conta> getAll(){
		List<Conta> lista = new ArrayList<Conta>();
		repo.findAll().forEach(lista :: add);
		return lista;
	}
	
	public Conta updateConta(long id, Conta contaNova) {
		Conta contaAntiga = getById(id);
		contaAntiga.setTitular(contaNova.getTitular());
		contaAntiga.setSaldo(contaNova.getSaldo());
		return repo.save(contaAntiga);
	}
	
	public void deleteConta(long id) {
		repo.deleteById(id);
	}
}
