package com.apps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.entities.Project;
import com.apps.repositories.ProjectRepository;
import com.apps.utils.RecordAlreadyExistsException;
import com.apps.utils.RecordNotFoundException;

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

public List<Project> getProjects(Integer min,Integer max){
	return prepo.getProjects(min, max);
}

public void addProject(Project p) throws RecordAlreadyExistsException {
      Project project=prepo.findByPno(p.getPno());
      if(project!=null)
    	  throw new RecordAlreadyExistsException();
      prepo.save(p);
 }

public void updateProject(Project p) throws RecordNotFoundException {
	Project project = prepo.findByPno(p.getPno());
	if(project==null)
		  throw new RecordNotFoundException();
	p.setName(p.getName()==null?project.getName():p.getName());
	p.setTeamsize(p.getTeamsize()==null?project.getTeamsize():p.getTeamsize());
	p.setTechnology(p.getTechnology()==null?project.getTechnology():p.getTechnology());
	prepo.save(p);
	
}

public void deleteProject(Integer pno) throws RecordNotFoundException
{
	Project project =prepo.findByPno(pno);
	if(project==null)
		throw new RecordNotFoundException();
	prepo.delete(project);
}

public Project getProject(Integer pno) throws RecordNotFoundException {
	Project p=prepo.findByPno(pno);
	if(p==null)
		throw new RecordNotFoundException();
	return p;
}

}
