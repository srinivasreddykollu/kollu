package com.codebyte.SpringDemo.controller;

import com.codebyte.SpringDemo.entity.Department;
import com.codebyte.SpringDemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments/save")
    public Department saveDepartments(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @PutMapping("/departments/update")
    public Department updateDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
   @GetMapping("/departments/get")
    public List<Department> fetchDepartmentsList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully!";
    }




}
