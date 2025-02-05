package com.apps.utils;

public class RecordNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Not Found:"+toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "No record Exists with the ID";
	}
   
}
