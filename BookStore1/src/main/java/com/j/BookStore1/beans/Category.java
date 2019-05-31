package com.j.BookStore1.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
@SequenceGenerator(name = "catseq", initialValue=100, allocationSize=4)
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="catseq")
	@Column(name = "categoryId")
	private int categoryId;
	
	@NotNull
	@Column(name = "categoryName")
	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

} 