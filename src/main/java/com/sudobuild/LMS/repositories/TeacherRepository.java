package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
  }