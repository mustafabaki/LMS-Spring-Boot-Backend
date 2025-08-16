package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.AssignmentSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentSubmissionRepository extends JpaRepository<AssignmentSubmission, String> {
  }