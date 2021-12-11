package com.andrei.bootspringdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.andrei.bootspringdatarest.entity.Customer;



//@RepositoryRestResource(path="members")  	//modify the path
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	//<Entity type, PK type>  needed for Spring Data JPA  and Spring Data REST endpoints.
}
