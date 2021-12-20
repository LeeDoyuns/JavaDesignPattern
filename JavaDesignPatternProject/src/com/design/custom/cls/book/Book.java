package com.design.custom.cls.book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

import com.design.custom.cls.singleton.BookShelf;

public class Book {

	private HashSet<Book>bookList  = BookShelf.getInstance();
	private String title;
	private int price;
	private String author;
	private String code;
	
	protected Book(BookBuilder builder) {
		String dt = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		
		//code중복 제거1
		if(bookList == null) {
			dt = dt+1;
		}else {
			dt = dt + (bookList.size()+1);
			
		}
		
		this.title = builder.getTitle();
		this.price = builder.getPrice();
		this.author = builder.getAuthor();
		this.code = "BkNo"+ dt;
	}
	
	public static BookBuilder Builder() {
		return new BookBuilder();
	}
	
	public String getBookCode() {
		return code;
	}
	
	public String getBookTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "[책 번호 : "+code+"], 제목 : "+title +", 작가 : " +author+", 가격 : \\"+price; 
	}
}
