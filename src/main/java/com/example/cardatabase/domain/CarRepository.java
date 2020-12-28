package com.example.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends CrudRepository <Car, Long> { 
		
	// Fetch cars by brand using SQL
	
}

