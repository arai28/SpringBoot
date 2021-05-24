package com.pluralsight.repository;

import com.pluralsight.entity.Application;
import org.springframework.data.repository.CrudRepository;


// the interfaces are empty because remember springboot automatically provides the implementation for us
//Just extend a CrudRepository and pass in it the domain/entity class(here Application) along with the data type
//of its id...spring data JPA handles the rest
public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
