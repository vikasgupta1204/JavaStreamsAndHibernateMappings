package com.springorm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Student_Laptop")
public class Laptop {
	@Id
	int laptop_id;
	String brand;
	String model_number;
	
	@OneToOne
	
	//to rename the join column in laptop table
	@JoinColumn(name="student_id")
	private Student student;
}
