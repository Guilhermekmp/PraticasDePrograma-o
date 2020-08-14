package br.com.caixagov.Atividade.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Agencia {

	@Id
	public int numeroDaAgencia;
	
	@OneToMany
	public List<Conta> contas;
	
	@ManyToOne
	public Banco banco;
}
