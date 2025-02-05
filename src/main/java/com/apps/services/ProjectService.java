package com.apps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.entities.Project;
import com.apps.repositories.ProjectRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProjectService {
@Autowired
private ProjectRepository prepo;

@PostConstruct
public void init(){
	System.out.println("Inject object type:"+prepo.getClass().getName());
}

public List<Project> getProjects(){
	return prepo.findAll();
}
}
