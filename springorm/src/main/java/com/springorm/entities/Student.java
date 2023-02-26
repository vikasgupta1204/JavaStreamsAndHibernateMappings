package com.springorm.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jpa_student")
@Data
public class Student {
	@Id
		private int studentId;
		private String studentName;
		private String about;
		//to avoid creating foreign key two tables we use mappedBy 
		@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
		private Laptop laptop;
		

		@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
		private List<Address> addressList=new ArrayList<>();
		
}
