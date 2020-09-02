package com.gov.pocketmoney.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.gov.pocketmoney.models.Agencia;
import com.gov.pocketmoney.repositories.AgenciaRepository;

@Service @Validated
public class AgenciaService {

	@Autowired
	public AgenciaRepository repo;
	
	public void createAgencia(Agencia agencia){
		repo.save(agencia);
	}
	
	public Agencia getById(long id){
		return repo.findById(id).get();
	}
	
	public List<Agencia> getAll(){
		List<Agencia> lista = new ArrayList<Agencia>();
		repo.findAll().forEach(lista :: add);
		return lista;
	}
	
	public Agencia updateAgencia(long id, Agencia agenciaAtualizada) {
		Agencia agenciaAntiga = getById(id);
		agenciaAntiga.setNumeroDaAgencia(agenciaAtualizada.getNumeroDaAgencia());
		repo.save(agenciaAntiga);
		return agenciaAntiga;
	}
	
	public void deleteAgencia(long id) {
		repo.deleteById(id);
	}
}
