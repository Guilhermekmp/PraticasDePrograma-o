package com.gov.pocketmoney.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gov.pocketmoney.models.Agencia;
import com.gov.pocketmoney.services.AgenciaService;

@RestController
public class AgenciaController {

	@Autowired
	public AgenciaService serve;
	
	@GetMapping(path = "/agencia")
	public ResponseEntity<List<Agencia>> getAll(){
		return new ResponseEntity<List<Agencia>>(serve.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/agencia/{id}")
	public ResponseEntity<Agencia> getById(@RequestBody long id){
		return new ResponseEntity<Agencia>(serve.getById(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/agencia")
	public ResponseEntity<Agencia> createAgencia(@RequestBody Agencia agenciaNova){
		Agencia agenciaCriada = agenciaNova;
		serve.createAgencia(agenciaNova);
		return new ResponseEntity<Agencia>(agenciaCriada, HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/agencia/{id}")
	public ResponseEntity<Agencia> updateAgencia(@RequestBody long id,@RequestBody Agencia agenciaAtualizada){
		return new ResponseEntity<Agencia>(serve.updateAgencia(id, agenciaAtualizada), HttpStatus.OK);
	}
	
	public ResponseEntity<Agencia> deleteAgencia(@RequestBody long id){
		Agencia agencia = serve.getById(id);
		boolean agenciaDeletada = false;
		if(agencia != null) {
			serve.deleteAgencia(id);
			agenciaDeletada = true;
		}if(agenciaDeletada) {
			return new ResponseEntity<Agencia>(agencia, HttpStatus.OK);
		}else {
			return new ResponseEntity<Agencia>(agencia, HttpStatus.NOT_FOUND);
		}
		
	}
}
