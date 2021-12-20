package com.design.custom.factory;

import java.util.HashSet;

import com.design.custom.cls.book.Book;
import com.design.custom.cls.member.MemberInterface;
import com.design.custom.cls.singleton.BookShelf;
import com.design.custom.intface.Person;

/**
 * 멤버 등록,삭제와
 * 대출,반납,대출기간 연장 등을 관리하는 클래스.
 * @author Doyun
 *
 */
public class MemberSystem extends MemberInterface{
	
	
	
	//대출
	public void rentalBook(Person m, Book b) {
		BookSystem book = new BookSystem();
		//rentalList에 삽입
		book.addRentalList(m, b);
		//소유한 책리스트에서 삭제.
		book.removeBook(b);
	}
	
	//대출
		public void rentalBook(Person m, Book b,String rentalEndDate) {
			BookSystem book = new BookSystem();
			
			//소유한 책리스트에서 삭제.
			book.removeBook(b);
			//rentalList에 삽입
			book.addRentalList(m, b,rentalEndDate);
			
			
		}
	
	//반납
	public void returnBook(Person m, Book b) {
		
	}
	
	//연장
	public void extensionRentalDate(Person m, Book b) {
		
	}

}
