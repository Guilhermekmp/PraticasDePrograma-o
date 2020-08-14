package br.com.caixagov.Atividade.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Conta {

	@Id
	public int Id;
	
	public int numeroDaConta;
	@ManyToOne
	public Agencia agencia;
}
