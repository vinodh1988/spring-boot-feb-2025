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
    private String teamsize;
@Column	
    private String technology;
	
	public Project() {}
	
	public Project(Integer pno, String name, String teamsize, String technology) {
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

	public String getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(String teamsize) {
		this.teamsize = teamsize;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
