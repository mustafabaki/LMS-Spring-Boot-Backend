package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, String> {
  }