package br.com.caixagov.Atividade.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.caixagov.Atividade.models.Banco;

@RepositoryRestResource(collectionResourceRel = "banco", path = "banco")
public interface BancoRepository extends PagingAndSortingRepository<Banco, String> {

}
