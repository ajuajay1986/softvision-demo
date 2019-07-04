package com.softvision.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softvision.model.Books;

public interface BookRepository extends JpaRepository<Books, Long>{

}
