package com.design.custom.cls.singleton;

import java.util.HashSet;

import com.design.custom.cls.member.Member;
import com.design.custom.intface.Person;

public class MemberList {
	
	private static HashSet<Person> memberList;
		
	/*최초에만 인스턴스를 생성하고 그 이후는 생성하지 않는다.*/
	public static HashSet<Person> getInstance(){
		if(memberList == null ) {
			memberList = new HashSet<Person>();
		}
		return memberList;
	}
}
