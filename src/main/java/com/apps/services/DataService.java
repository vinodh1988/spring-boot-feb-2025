package com.apps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apps.entities.Computer;

@Service
public class DataService {
   
	 private List<Computer> computers=new ArrayList<Computer>();
	 
	 
	 public String[] getNames() {
		 String[] names= {
				 "Lokesh","Harry","Nana","Veena","Prem","Joseph"
		 };
		 return names;
	 }
	 
	 public void addComputer(Computer c) {
	    computers.add(c);
	 }
	 
	 public List<Computer> getComputers(){
		 return computers;
	 }
}
