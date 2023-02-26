package com.springorm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springorm.entities.Address;
import com.springorm.entities.Category;
import com.springorm.entities.Laptop;
import com.springorm.entities.Product;
import com.springorm.entities.Student;
import com.springorm.repositories.CategoryRepository;
import com.springorm.repositories.ProductRepository;
import com.springorm.repositories.StudentRepository;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {
	@Autowired
private  StudentRepository studentRepository;
	
@Autowired
private CategoryRepository categoryRepository;
@Autowired
private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	
	}
	@Override
	public void run(String... args) throws Exception {
//		Student student=new Student();
//		student.setStudentName("Tripti");
//		student.setAbout("I am a software tester");
//		student.setStudentId(3);;
//		
//	Address a1=new Address();
//	a1.setAddressId(1);
//	a1.setCity("Jaipur");	
//	a1.setCountry("India");
//	a1.setStreet("Kailashpuri");
//	a1.setStudent(student);
//	
//	Address a2=new Address();
//	a2.setAddressId(2);
//	a2.setCity("Delhi");
//	a2.setCountry("India");
//	a2.setStreet("Rohini");
//	a2.setStudent(student);
//	Address a3=new Address();
//	a3.setAddressId(3);
//	a3.setCity("Jodhpur");
//	a3.setCountry("India");
//	a3.setStreet("chaura rasta");
//	a3.setStudent(student);
//		
//		Laptop laptop=new Laptop();
//		laptop.setBrand("lenevo");
//		laptop.setLaptop_id(1);
//		laptop.setModel_number("ABC1234");
//		//important
//		laptop.setStudent(student);
//		
//		student.setLaptop(laptop);
//		List< Address> addressList=new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//		addressList.add(a3);
//		student.setAddressList(addressList);
//		Student savedStudent=studentRepository.save(student);
//		
//	//	Student s1=studentRepository.findById(2).get();
//		//System.out.println(s1);
//		System.out.println(savedStudent);
		
		Product product1=new Product();
		product1.setPId("pid1");
		product1.setProductName("Iphone 14 max pro");
		Product product2=new Product();
		product2.setPId("pid2");
		product2.setProductName("Samsung s22 ultra");
		Product product3=new Product();
		product3.setPId("pid3");
		product3.setProductName("Samsung TV");
		
		Category category1=new Category();
		category1.setCid("cid1");
		category1.setTitle("Electronics");
		Category category2=new Category();
		category2.setCid("cid2");
		category2.setTitle("Mobile Phone");
		
		List<Product> category1products=category1.getProducts();
		category1products.add(product1);
		category1products.add(product2);
		category1products.add(product3);
		
		List<Product>  category2products=category2.getProducts();
		category2products.add(product2);
		category2products.add(product1);
//		product1.getCategories().add(category1);
//		product1.getCategories().add(category2);
//		product2.getCategories().add(category1);
//		product2.getCategories().add(category2);
//		product3.getCategories().add(category1);
	
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
		
	}

}
