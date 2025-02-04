package com.apps.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
   
	 public String[] getNames() {
		 String[] names= {
				 "Lokesh","Harry","Nana","Veena","Prem","Joseph"
		 };
		 return names;
	 }
}
