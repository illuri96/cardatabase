package com.example.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OwnerRepository extends CrudRepository<Owner, Long>
{
	
}

