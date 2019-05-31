package com.j.BookStore1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j.BookStore1.beans.Reviews;
import com.j.BookStore1.dao.CustomerReviewDao;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	CustomerReviewDao customerReviewDao;	

	@Override
	public List<Reviews> findAll(int bookId) {
		return customerReviewDao.findAll();
		
	}

	@Override
	public Reviews save(Reviews review) {
		return customerReviewDao.save(review);
	}

	@Override
	public void update(Reviews review) {
		customerReviewDao.saveAndFlush(review);
		
	}

	@Override
	public boolean delete(int reviewId) {
      customerReviewDao.deleteById(reviewId);
		return true;
	}




}
