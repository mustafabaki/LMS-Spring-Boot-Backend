package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
  }