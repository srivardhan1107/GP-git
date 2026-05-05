package com.spring.ems.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

@Id
private int Id;
private String name;
private String Email;
private long number;

}
