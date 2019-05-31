package com.j.BookStore1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.j.BookStore1.beans.Reviews;
import com.j.BookStore1.service.ReviewServiceImpl;

@RestController
public class BookStore1Controller {
	

	@Autowired
	ReviewServiceImpl serviceImpl;
		
		
	@RequestMapping(value = "/findAllReviews/{bookId}", method = RequestMethod.GET)
	public List<Reviews> findAllReviews(@PathVariable int bookId) {
			return serviceImpl.findAll(bookId);
	} 
	@RequestMapping(value="/saveAllReviews/",method=RequestMethod.PUT)
	public Reviews saveAllReviews(@RequestBody Reviews review) {
		return serviceImpl.save(review);
	}
    
}
