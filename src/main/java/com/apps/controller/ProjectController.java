package com.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.entities.Project;
import com.apps.services.ProjectService;
import com.apps.utils.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

@Autowired
private ProjectService pservice;
@GetMapping("")
	 public List<Project> getProjects() {
		 return pservice.getProjects();
	 }
@PostMapping()
public ResponseEntity<Object> addProject(@RequestBody Project project) {
	try {
		pservice.addProject(project);
		return new ResponseEntity<>(project,HttpStatus.CREATED);
	}
	catch(RecordAlreadyExistsException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	catch(Exception e) {
		return new ResponseEntity<>("Server side issue", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}
