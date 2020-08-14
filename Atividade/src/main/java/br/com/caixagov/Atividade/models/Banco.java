package br.com.caixagov.Atividade.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Banco {
	
	@Id
	public String nome;
	
	@OneToMany
	public List<Agencia> agencias;
}
