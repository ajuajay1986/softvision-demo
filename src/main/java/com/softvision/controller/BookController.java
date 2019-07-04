package com.softvision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softvision.model.Books;
import com.softvision.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(value="booklist", method=RequestMethod.GET)
	Page<Books> bookPageable(Pageable pageable){
		return bookRepository.findAll(pageable);
	}

}
