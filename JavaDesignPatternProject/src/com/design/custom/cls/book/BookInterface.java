package com.design.custom.cls.book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.design.custom.cls.singleton.BookShelf;
import com.design.custom.intface.Display;

/**
 * 책의 등록과 삭제를 담당.
 * @author Doyun
 *
 */
public abstract class BookInterface implements Display{
	
	private HashSet<Book> bookList;
	
	
	public BookInterface() {
		bookList = BookShelf.getInstance();
	}
	
	public Iterator<Book> retrieveBookList() {
		return bookList.iterator();
	}
	
	public Book registerBook(String title, int price,String author) {
		
		Book book = Book.Builder().price(price)
							.title(title)
							.author(author)
							.build();
		
		addBook(book);
		return book;
	}

	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public void removeBook(Book book) {
		bookList.remove(book);
	}
	
	

}
