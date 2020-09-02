package com.gov.pocketmoney.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gov.pocketmoney.models.Conta;
import com.gov.pocketmoney.services.ContaService;

@RestController
public class ContaController {

	@Autowired
	public ContaService service;
	
	@GetMapping(path = "/conta")
	public ResponseEntity<List<Conta>> getAll(){
		return new ResponseEntity<List<Conta>>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/conta/{id}")
	public ResponseEntity<Conta> getById(@RequestBody long id){
		return new ResponseEntity<Conta>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/conta")
	public ResponseEntity<Conta> createConta(@RequestBody Conta novaConta) {
		Conta contaCriada = service.createConta(novaConta);
		return new ResponseEntity<Conta>(contaCriada, HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/conta/{id}")
	public ResponseEntity<Conta> updateConta(@RequestBody long id, @RequestBody Conta contaNova){
		return new ResponseEntity<Conta>(service.updateConta(id, contaNova), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/conta/{id}")
	public ResponseEntity<Conta> deleteConta(@RequestBody long id){
		Conta conta = service.getById(id);
		boolean contaDeletada = false;
		if(conta != null) {
			service.deleteConta(id);
			contaDeletada = true;
		}if(contaDeletada) {
			return new ResponseEntity<Conta>(conta, HttpStatus.OK);
		}else {
			return new ResponseEntity<Conta>(conta, HttpStatus.NOT_FOUND);
		}
	}
}
