package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.AssignmentAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentAttachmentRepository extends JpaRepository<AssignmentAttachment, String> {
  }