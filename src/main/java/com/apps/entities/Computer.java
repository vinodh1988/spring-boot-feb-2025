package com.apps.entities;

public class Computer {
  private Integer cno;
  private String brand;
  private String cpu;
  private String ram;
  private String storage;
public Computer() {
	super();
	// TODO Auto-generated constructor stub
}
public Computer(Integer cno, String brand, String cpu, String ram, String storage) {
	super();
	this.cno = cno;
	this.brand = brand;
	this.cpu = cpu;
	this.ram = ram;
	this.storage = storage;
}
public Integer getCno() {
	return cno;
}
public void setCno(Integer cno) {
	this.cno = cno;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public String getStorage() {
	return storage;
}
public void setStorage(String storage) {
	this.storage = storage;
}
  
  
}
