package com.application.repository;

import com.application.model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
			extends CrudRepository<EmployeeEntity, Long> {

}
