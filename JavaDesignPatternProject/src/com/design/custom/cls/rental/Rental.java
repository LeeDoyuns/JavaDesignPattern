package com.design.custom.cls.rental;

import java.time.LocalDate;

public class Rental {

	private String name;
	private String bookCode;
	private LocalDate rentalStrtDate;
	private LocalDate rentalEndDate;
	private String title;
	
	
	protected Rental(RentalBookBuilder builder) {
		this.name = builder.getName();
		this.bookCode = builder.getBookCode();
		this.rentalStrtDate = builder.getRentalStrtDate();
		this.rentalEndDate = builder.getRentalEndDate();
		this.title= builder.getTitle();
	}
	

	public static RentalBookBuilder Build() {
		return new RentalBookBuilder();
	}


	@Override
	public String toString() {
		return "[대출인=" + name + ", 책명=" + title +", 코드="+bookCode + ", 대출 시작일=" + rentalStrtDate
				+ ", 대출종료일=" + rentalEndDate + "]";
	}
	
	
	
}
