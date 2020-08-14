package br.com.caixagov.Atividade.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.caixagov.Atividade.models.Agencia;

@RepositoryRestResource(collectionResourceRel = "agencia", path = "agencia")
public interface AgenciaRepository extends PagingAndSortingRepository<Agencia, Integer>{

}
