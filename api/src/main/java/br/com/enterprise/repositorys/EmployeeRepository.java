package br.com.enterprise.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.enterprise.models.Employee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{

}
