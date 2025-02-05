package com.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.entities.Project;
import com.apps.services.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

@Autowired
private ProjectService pservice;
@GetMapping("")
	 public List<Project> getProjects() {
		 return pservice.getProjects();
	 }
}
