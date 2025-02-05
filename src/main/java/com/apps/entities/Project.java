package com.apps.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class Project {
@Id
	private Integer pno;
@Column
    private String name;
@Column	
    private Integer teamsize;
@Column	
    private String technology;
	
	public Project() {}
	
	public Project(Integer pno, String name,Integer teamsize, String technology) {
		super();
		this.pno = pno;
		this.name = name;
		this.teamsize = teamsize;
		this.technology = technology;
	}

	public Integer getPno() {
		return pno;
	}

	public void setPno(Integer pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(Integer teamsize) {
		this.teamsize = teamsize;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
