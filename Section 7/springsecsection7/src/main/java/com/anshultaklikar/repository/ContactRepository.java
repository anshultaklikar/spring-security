package com.anshultaklikar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anshultaklikar.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
