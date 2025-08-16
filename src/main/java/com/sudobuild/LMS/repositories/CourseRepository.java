package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
  }