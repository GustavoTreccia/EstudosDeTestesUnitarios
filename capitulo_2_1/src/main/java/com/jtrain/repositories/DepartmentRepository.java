package com.jtrain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtrain.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
