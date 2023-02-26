package com.springorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springorm.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
