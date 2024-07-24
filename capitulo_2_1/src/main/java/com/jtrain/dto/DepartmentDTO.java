package com.jtrain.dto;

import java.io.Serializable;

import com.jtrain.entities.Department;

public class DepartmentDTO implements Serializable{

	private static final long serialVersionUID = 8606549653896788793L;
	
	public Long id;
	public String name;
	
	public DepartmentDTO() {}

	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
