package com.dailycodebuffer.springboot.tutorial.service;

import java.util.List;

import com.dailycodebuffer.springboot.tutorial.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department fetchDepartmentById(Long departmentId);

	void deleteDepartmentById(Long departmentId);

	Department updateDepartment(Long departmentId, Department department);

}
