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

import com.apps.entities.Computer;
import com.apps.services.DataService;


@RestController
@RequestMapping("/api/computers")
public class ComputerAPI {
	@Autowired
	private DataService dservice;
	
	@GetMapping("")
	public List<Computer> getAll(){
		return dservice.getComputers();
	}

	
	@PostMapping("")
	public ResponseEntity<Object> addComputer(@RequestBody Computer computer) {
		//TODO: process POST request
		dservice.addComputer(computer);
		return new ResponseEntity<>("successfuly inserted", HttpStatus.CREATED) ;
	}
	
}
