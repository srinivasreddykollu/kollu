package com.codebyte.SpringDemo.service;

import com.codebyte.SpringDemo.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
   public  Department saveDepartment(Department department);

  public  List<Department> fetchDepartmentList();

   public  Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}



