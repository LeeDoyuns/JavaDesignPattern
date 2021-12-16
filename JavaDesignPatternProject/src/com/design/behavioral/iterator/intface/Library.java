package com.design.behavioral.iterator.intface;

import java.util.Iterator;

import com.design.behavioral.iterator.cls.Book;

public interface Library {
	public Iterator<Book> createIterator();

}
