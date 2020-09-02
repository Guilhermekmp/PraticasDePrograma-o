package com.gov.pocketmoney.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
public class Agencia {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(unique = true)
	public int numeroDaAgencia;
	
}
