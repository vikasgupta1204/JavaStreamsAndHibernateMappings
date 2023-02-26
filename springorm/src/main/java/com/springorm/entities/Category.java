package com.springorm.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jpa_category")
public class Category {

	@Id
	private String cid;
	private String title;
	
	@ManyToMany(cascade  = CascadeType.ALL)
	private List<Product> products=new ArrayList<>();
	
	
}
