package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
  }