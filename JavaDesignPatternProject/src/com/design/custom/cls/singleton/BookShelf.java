package com.design.custom.cls.singleton;

import java.util.HashSet;

import com.design.custom.cls.book.Book;

/**
 * static
 * @author Doyun
 *
 */
public class BookShelf {

	private static HashSet<Book> bookList;
	
	/*최초에만 인스턴스를 생성하고 그 이후는 생성하지 않는다.*/
	public static HashSet<Book> getInstance(){
		if(bookList == null ){
			bookList = new HashSet<Book>(); 
		}
		return bookList;
	}
}
