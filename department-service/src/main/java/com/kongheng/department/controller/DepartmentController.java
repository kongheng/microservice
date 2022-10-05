package com.kongheng.department.controller;

import com.kongheng.department.entity.Department;
import com.kongheng.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{departmentId}")
  public Department findDepartmentById(@PathVariable("departmentId")  Long departmentId) {
    return departmentService.findByDepartmentId(departmentId);
  }
}
