package com.j.BookStore1.beans;

import java.math.BigDecimal;
import java.util.Date;
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
@Table(name="Book")
@SequenceGenerator(name = "bookseq", initialValue=100, allocationSize=4)
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bookseq")
	@Column(name = "bookId")
	private int bookId;
	
	@OneToOne
	@JoinColumn
	private Category category;
	
	@Column(name = "authorName")
	private String authorName;
	
	@NotNull
	@Column(name = "isbn")
	private String isbn;
	    

	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private BigDecimal price;
	    
	@Column(name = "description")  
    private String desription;
	
	@NotNull
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "publishDate")
	private Date publishDate;
	
	@Size(max=5, min=1)
	@Column(name = "rating")
	private Double rating;
	    
	@Column(name = "bookImage")
	private String bookImage;
	
	@Column(name = "copiesSold")
	private int copiesSold;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}


	public int getCopiesSold() {
		return copiesSold;
	}


	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}
	
	
	

} 