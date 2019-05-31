package com.j.BookStore1.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Review")
@SequenceGenerator(name = "reviewseq", initialValue = 10, allocationSize = 100)

public class Reviews {
	@Id
	@Column(name="reviewId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviewseq")
	private int reviewId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerId")
	@NotNull
	private Customer customer;
	
	
	@Column(name = "rating")
	@NotNull
	private int rating;
	
	@Column(name = "comments")
	@NotNull
	private String comments;
	
	@Column(name = "reviewDateOn")
	@NotNull
	private Date reviewDateOn;
	
	
	
	
	/*
	  **Getter and Setter methods**
	 */
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comments;
	}
	public void setComment(String comment) {
		this.comments = comment;
	}
	public Date getReviewDateOn() {
		return reviewDateOn;
	}
	public void setReviewDateOn(Date reviewDateOn) {
		this.reviewDateOn = reviewDateOn;
	}
	
	
}
		
	
	
	

	
	
	


