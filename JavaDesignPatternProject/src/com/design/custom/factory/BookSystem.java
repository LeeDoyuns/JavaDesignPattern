package com.design.custom.factory;

import java.util.HashSet;
import java.util.LinkedList;

import com.design.custom.cls.book.Book;
import com.design.custom.cls.book.BookInterface;
import com.design.custom.cls.member.Member;
import com.design.custom.cls.rental.Rental;
import com.design.custom.cls.singleton.BookShelf;
import com.design.custom.cls.singleton.RentalList;
import com.design.custom.intface.Person;

/**
 * 책의 등록,삭제는 부모클래스에서 처리하고
 * 그 이외의 기능 처리
 * @author Doyun
 *
 */
public class BookSystem extends BookInterface{
	
	//대출 가능한 책 목록
	private HashSet<Book> bookList = BookShelf.getInstance();
	private LinkedList<Rental> rentalList = RentalList.getInstance();
	
	
	public void addRentalList(Person m, Book b) {
		Rental rental = Rental.Build().name(((Member)m).getName())
					.bookCode(b.getBookCode())
					.title(b.getBookTitle())
					.rentalStartDate(null)
					.rentalEndDate(null)
					.build();
		rentalList.add(rental);
		
	}
	
	public void addRentalList(Person m, Book b,String rentalEndDate) {
		Rental rental = Rental.Build().name(((Member)m).getName())
					.bookCode(b.getBookCode())
					.title(b.getBookTitle())
					.rentalStartDate(null)
					.rentalEndDate(rentalEndDate)
					.build();
		rentalList.add(rental);
		
	}
	
	public void printRentalList() {
		System.out.println("==============대출 목록===============");
		rentalList.forEach(ren->{
			System.out.println(ren);
		});
		System.out.println("====================================");
	}
	
	
	
}
