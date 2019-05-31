package com.j.BookStore1.service;

import java.util.List;

import com.j.BookStore1.beans.Reviews;

public interface ReviewService {
	List<Reviews> findAll(int bookId);
	public void update(Reviews review);
    public boolean delete(int reviewId);
	Reviews save(Reviews review);
}
