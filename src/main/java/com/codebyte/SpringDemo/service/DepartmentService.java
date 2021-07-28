package com.codebyte.SpringDemo.service;

import com.codebyte.SpringDemo.entity.Department;
import com.codebyte.SpringDemo.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
   public  Department saveDepartment(Department department);

  public  List<Department> fetchDepartmentList();

   public  Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

   public  Department updateDepartment(Long departmentId, Department department);

   public  Department fetchDepartmentByName(String departmentName);
}



