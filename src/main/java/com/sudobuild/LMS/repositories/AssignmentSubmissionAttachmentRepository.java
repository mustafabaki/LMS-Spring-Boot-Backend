package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.AssignmentSubmissionAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentSubmissionAttachmentRepository extends JpaRepository<AssignmentSubmissionAttachment, String> {
  }