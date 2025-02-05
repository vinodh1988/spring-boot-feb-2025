package com.apps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.apps.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
   public Project findByPno(Integer pno);
   
   @Query("select p from Project p where teamsize between :min and :max")
   public List<Project> getProjects(@Param("min") Integer  min,@Param("max") Integer max);
}
