package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.StudentHasCourse;
import com.sudobuild.LMS.models.StudentHasCourseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentHasCourseRepository extends JpaRepository<StudentHasCourse, StudentHasCourseId> {
  }