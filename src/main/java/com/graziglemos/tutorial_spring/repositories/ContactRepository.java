package com.graziglemos.tutorial_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graziglemos.tutorial_spring.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
