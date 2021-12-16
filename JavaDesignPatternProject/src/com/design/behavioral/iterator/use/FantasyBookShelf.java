package com.design.behavioral.iterator.use;

import java.util.*;

import com.design.behavioral.iterator.cls.Book;
import com.design.behavioral.iterator.intface.Library;

public class FantasyBookShelf implements Library{
	
	private Map<String,Book> bookList;

	
	public FantasyBookShelf() {
		bookList = new HashMap();
		
		addBook("해리포터와 마법사의 돌","조앤K롤링","문학수첩");
		addBook("달빛조각사","남희성","로크미디어");
		addBook("드래곤라자","이영도","황금가지");
		
	}
	
	private void addBook(String title,String author, String publisher) {
		Book book = new Book(title,author,publisher);
		bookList.put(title, book);
	}

	@Override
	public Iterator<Book> createIterator() {
		return bookList.values().iterator();
	}
	
	
	
}
