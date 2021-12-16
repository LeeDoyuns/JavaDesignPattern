package com.design.behavioral.iterator.use;

import java.util.ArrayList;
import java.util.Iterator;

import com.design.behavioral.iterator.cls.Book;
import com.design.behavioral.iterator.intface.Library;

public class HistoryBookShelf implements Library {
	
	public ArrayList<Book> bookList;
	
	public HistoryBookShelf() {
		bookList = new ArrayList<Book>();
		
		addBook("고구려","김진명","이타북스");
		addBook("소녀 유관순","안혜숙","문학의식");
		addBook("조선왕조실록","내시","조선왕조");
	}
	
	private void addBook(String title,String author,String publisher) {
		bookList.add(new Book(title,author,publisher));
	}

	@Override
	public Iterator<Book> createIterator() {
		return bookList.iterator();
	}

}
