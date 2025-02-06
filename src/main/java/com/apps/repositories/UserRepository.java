package com.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.entities.User;




public interface UserRepository extends JpaRepository<User, String> {
  public User findUserByUsername(String username);
}
