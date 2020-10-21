package com.nithin.config.Dao;

import org.springframework.data.repository.CrudRepository;

import com.nithin.config.Model.Employye;

public interface EmployeeRepository extends CrudRepository<Employye,Integer> {

}
