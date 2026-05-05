package com.spring.ems.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
	
	@Id
	private int id;
	private String name;

}
