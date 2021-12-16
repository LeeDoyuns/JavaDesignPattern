package com.design.behavioral.iterator.use;

import java.util.Iterator;

import com.design.behavioral.iterator.cls.Book;
import com.design.behavioral.iterator.intface.Library;

/**
 * client는 세부적인 컬렉션들에 대해서 알 필요가 없다.
 * iterator로 호출해서 확인만 하면된다. = 책임이 분리된 설계
 * @author Doyun
 *
 */
public class Client {
	
	private Library historyBook;
	private Library fantasyBook;
	
	public Client(Library historyBook,Library fantasyBook) {
		this.historyBook = historyBook;
		this.fantasyBook = fantasyBook;
	}
	
	public void printBook() {
		Iterator history = historyBook.createIterator();
		Iterator fantasy = fantasyBook.createIterator();
		
		System.out.println("===========history=============");
		printBook(history);
		System.out.println("===========fantasy=============");
		printBook(fantasy);
	}
	
	private void printBook(Iterator iter) {
		while(iter.hasNext()) {
			Book book = (Book) iter.next();
			System.out.println(book.toString());
		}
	}
	
}
