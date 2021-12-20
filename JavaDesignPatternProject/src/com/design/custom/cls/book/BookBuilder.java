package com.design.custom.cls.book;

public class BookBuilder {
	private String title;
	private int price;
	private String author;
	
	public BookBuilder() {
		
	}

	private BookBuilder(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	
	public Book build() {
		return new Book(new BookBuilder(title,price,author));
	}
	
	
	
	public BookBuilder title(String title) {
		this.title = title;
		return this;
	}
	public BookBuilder price(int price) {
		this.price = price;
		return this;
	}
	public BookBuilder author(String author) {
		this.author = author;
		return this;
	}
	
	
	

	protected String getTitle() {
		return title;
	}

	protected int getPrice() {
		return price;
	}

	protected String getAuthor() {
		return author;
	}
	
	
	

}
