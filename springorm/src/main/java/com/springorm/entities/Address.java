package com.springorm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="jpa_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	private int addressId;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
}
