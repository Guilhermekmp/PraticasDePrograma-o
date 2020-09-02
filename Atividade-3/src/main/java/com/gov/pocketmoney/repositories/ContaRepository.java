package com.gov.pocketmoney.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gov.pocketmoney.models.Conta;

@RepositoryRestResource(collectionResourceRel = "conta")
public interface ContaRepository extends CrudRepository<Conta, Long>{

}
