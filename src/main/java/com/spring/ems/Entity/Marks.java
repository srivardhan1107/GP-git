package com.spring.ems.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
	
@Id
	private int id;

	
	 private Student student;
	 private course course;
	
}
