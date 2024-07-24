package com.jtrain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jtrain.dto.EmployeeDTO;
import com.jtrain.entities.Department;
import com.jtrain.entities.Employee;
import com.jtrain.repositories.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAllPaged(Pageable pageable) {
		Page<Employee> page = repository.findAll(pageable);
		return page.map(x -> new EmployeeDTO(x));
	}

	public EmployeeDTO insert(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDepartment(new Department(dto.getDepartmentId(), null));
		entity = repository.save(entity);
		return new EmployeeDTO(entity);
	}

}
