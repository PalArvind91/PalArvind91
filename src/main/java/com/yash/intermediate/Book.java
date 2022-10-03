package com.yash.intermediate;


public class Book {
	
	String bookName;
	Double bookPrice;
	String bookType;
	String author;



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public Double getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}



	public String getBookType() {
		return bookType;
	}



	public void setBookType(String bookType) {
		this.bookType = bookType;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public Book(String bookName, Double bookPrice, String bookType, String author) {
		
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookType = bookType;
		this.author = author;
	}

	

}
