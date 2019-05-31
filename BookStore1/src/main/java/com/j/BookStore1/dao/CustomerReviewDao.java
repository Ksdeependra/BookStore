package com.j.BookStore1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j.BookStore1.beans.Reviews;

public interface CustomerReviewDao extends JpaRepository<Reviews,Integer > {
	

}
