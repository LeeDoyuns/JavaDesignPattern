package com.design.custom.cls.singleton;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import com.design.custom.cls.rental.Rental;
import com.design.custom.factory.BookSystem;

public class RentalList {
	
	private static LinkedList<Rental> rentalList;
	
	public static LinkedList<Rental> getInstance(){
		
		if(rentalList ==null) {
			rentalList = new LinkedList<Rental>();
		}
		return rentalList;
		
	}

}
