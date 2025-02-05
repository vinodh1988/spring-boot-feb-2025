package com.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
   public Project findByPno(Integer pno);
}
