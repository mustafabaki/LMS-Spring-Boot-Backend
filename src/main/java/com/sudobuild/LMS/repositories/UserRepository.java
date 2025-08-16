package com.sudobuild.LMS.repositories;

import com.sudobuild.LMS.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  }