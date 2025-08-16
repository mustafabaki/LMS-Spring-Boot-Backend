package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, String> {
  }