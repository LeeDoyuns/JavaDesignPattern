package com.design.behavioral.iterator.cls;

public class Book {
	
	private String title,author,publisher;
	
	public Book(String title,String author,String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "this book is title = "+title+", author = "+author+", publisher = "+publisher;
	}
	

}
