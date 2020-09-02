package com.gov.pocketmoney.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gov.pocketmoney.models.Agencia;

@RepositoryRestResource(collectionResourceRel = "agenciaBancaria")
public interface AgenciaRepository extends CrudRepository<Agencia, Long>{

}
