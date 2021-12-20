package com.design.custom.cls.member;

import java.util.HashSet;
import java.util.Iterator;

import com.design.custom.cls.book.Book;
import com.design.custom.cls.singleton.BookShelf;
import com.design.custom.cls.singleton.MemberList;
import com.design.custom.intface.Membership;
import com.design.custom.intface.Person;
/**
 * 멤버의 등록과 삭제 담당
 * @author Doyun
 *
 */
public abstract class MemberInterface  implements Membership{
	
	private HashSet<Person> memberList;
	private HashSet<Book> bookList;
	
	
	public MemberInterface() {
		memberList = MemberList.getInstance();
		bookList = BookShelf.getInstance();
	}
	
	public Person createMemberInfo(String name,int age,char sex,String addr) {
		
		Person m = Member.MemberBuild()
				.name(name)
				.age(age)
				.sex(sex)
				.address(addr)
				.build();
		
		registerMember(m);
		return m;
	}
	
	public Person createAdminMember(String name,int age,char sex,String addr) {
		Person m = Member.AdminBuild()
				.name(name)
				.age(age)
				.sex(sex)
				.address(addr)
				.build();

		registerMember(m);
		return m;
	}
	
	@Override
	public void registerMember(Person m) {
		memberList.add(m);
	}

	@Override
	public void removeMember(Person m) {
		System.out.println(((Member)m).getName()+" 회원 탈퇴요청 처리.");
		memberList.remove(m);
	}

	public Iterator<Person> retrieveMember() {
		return memberList.iterator();
	}
	
	
	
	
	

}
