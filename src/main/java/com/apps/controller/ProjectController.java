package com.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apps.entities.Project;
import com.apps.services.ProjectService;
import com.apps.utils.RecordAlreadyExistsException;
import com.apps.utils.RecordNotFoundException;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

@Autowired
private ProjectService pservice;
@GetMapping("")
	 public List<Project> getProjects
	 (@RequestParam(required = false) Integer min,@RequestParam(required=false) Integer max) {
	System.out.println(min+"  "+max);
	 if(min==null && max==null)
	     return pservice.getProjects();
	 if(min==null)
		 return pservice.getProjects(0,max);
	 if(max==null)
		 return pservice.getProjects(min,Integer.MAX_VALUE);
	 
		 return pservice.getProjects(min,max);
	 }
@GetMapping("/{pno}")
	public ResponseEntity<Object> getProject(@PathVariable Integer pno) throws RecordNotFoundException 
    {
	    return new ResponseEntity<Object>(pservice.getProject(pno),HttpStatus.OK);
    }
 
@PostMapping()
public ResponseEntity<Object> addProject(@RequestBody Project project) throws RecordAlreadyExistsException{

		pservice.addProject(project);
		return new ResponseEntity<>(project,HttpStatus.CREATED);
	
}

@RequestMapping(value="",method = {RequestMethod.PUT,RequestMethod.PATCH})
public ResponseEntity<Object> update(@RequestBody Project project) throws RecordNotFoundException
{
      pservice.updateProject(project);
      return new ResponseEntity<>("Record updated",HttpStatus.OK);
      
}

@DeleteMapping("/{pno}")
public ResponseEntity<Object> delete(@PathVariable Integer pno) throws RecordNotFoundException{
	pservice.deleteProject(pno);
	return new ResponseEntity<>("Record Deleted",HttpStatus.OK);
}


}
