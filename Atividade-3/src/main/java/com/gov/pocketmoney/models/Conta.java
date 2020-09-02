package com.gov.pocketmoney.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
public class Conta {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	public String titular;
	public double saldo;
	
	@Column(unique = true)
	public int numeroDaConta;
	
}
