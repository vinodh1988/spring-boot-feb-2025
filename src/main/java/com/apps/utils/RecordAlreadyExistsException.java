package com.apps.utils;

public class RecordAlreadyExistsException extends Exception {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Record Exists: "+toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Project with this ID Already Exists";
	}
	
	

}
