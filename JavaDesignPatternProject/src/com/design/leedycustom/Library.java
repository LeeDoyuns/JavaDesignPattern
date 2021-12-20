package com.design.leedycustom;

import java.util.Iterator;

import com.design.custom.cls.book.Book;
import com.design.custom.cls.book.BookInterface;
import com.design.custom.cls.member.MemberInterface;
import com.design.custom.factory.BookSystem;
import com.design.custom.factory.MemberSystem;
import com.design.custom.intface.Person;

/**
 * 도서관
 * 회원 등록/삭제
 * 도서 등록/삭제
 * 도서 대출/반납
 * @author Doyun
 */
public class Library {
	
	public static void main(String[] args) {
		
		BookSystem book = new BookSystem();
		MemberSystem member = new MemberSystem();
		
		//회원 등록
		Person john = member.createMemberInfo("john", 15, 'M', "화순군");
		Person cury = member.createMemberInfo("cury", 20, 'F', "서울시 독산공");
		Person danny = member.createMemberInfo("danny", 10, 'M', "시흥시");
		Person petty = member.createMemberInfo("petty", 16, 'F', "진주시 칠암동");
		Person adminDan = member.createAdminMember("dan", 30, 'M', "서울시 화곡동");
		
		
		Book harrypotter1 = book.registerBook("해리포터와 마법사의 돌", 17000, "조앤K롤링");
		Book harrypotter2 = book.registerBook("해리포터와 비밀의방", 17000, "조앤K롤링");
		Book harrypotter3 = book.registerBook("해리포터와 아즈카반의 죄수", 17000, "조앤K롤링");
		Book harrypotter4 = book.registerBook("해리포터와 불의잔", 17000, "조앤K롤링");
		Book harrypotter5 = book.registerBook("해리포터와 불사조기사단", 17000, "조앤K롤링");
		
		
		Book fallSky = book.registerBook("가을 하늘", 11000, "채만식");
		Book look = book.registerBook("소설 보다", 3150, "김멜라");
		Book coffee = book.registerBook("향긋한 커피와 소설 한 스푼", 11600, "별솔,박정호 외 5명");
		
//		memberPrint(member.retrieveMember());	//멤버 출력
//		bookPrint(book.retrieveBookList());		//책목록 출력
		
		/* 책,멤버삭제 */
//		member.removeMember(john);
//		book.removeBook(harrypotter5);
		
//		memberPrint(member.retrieveMember());	//멤버 출력
		
		//대출
		member.rentalBook(cury, coffee);
		member.rentalBook(cury, harrypotter2,"2021-12-19");
//		book.printRentalList();	//대출 목록 출력
//		bookPrint(book.retrieveBookList());		//책목록 출력
		
		//반납
		member.returnBook(cury, harrypotter2);	//연체된 책
		member.returnBook(cury,  coffee);	//연체된 책
		bookPrint(book.retrieveBookList());		//반납 완료 - 책 목록 출력
		
		//대출 기간 연장
		
		
		
		
		
		
		
		
	}
	
	
	static void memberPrint(Iterator iter) {
		System.out.println("==================사람 목록==================");
		while(iter.hasNext()) {
			Person p = (Person) iter.next();
			p.print();
		}
		System.out.println("===========================================");
	}
	
	static void bookPrint(Iterator iter) {
		System.out.println("==================도서 목록==================");
		while(iter.hasNext()) {
			Book b = (Book) iter.next();
			System.out.println(b.toString());
		}
		System.out.println("===========================================");
	}
	
	
	
	
}
