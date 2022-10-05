package com.kongheng.department.service;

import com.kongheng.department.entity.Department;
import com.kongheng.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  public Department findByDepartmentId(Long departmentId) {
    return departmentRepository.findByDepartmentId(departmentId);
  }
}
