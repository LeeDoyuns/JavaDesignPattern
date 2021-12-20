package com.design.custom.cls.rental;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class RentalBookBuilder {
	
	private String name;
	private String bookCode;
	private LocalDate rentalStrtDate;
	private LocalDate rentalEndDate;
	private String title;
	
	public RentalBookBuilder() {
		
	}
	
	private RentalBookBuilder(String name, String bookCode,LocalDate rentalStartDt, LocalDate rentalEndDt,String bookName) {
		this.name = name;
		this.bookCode = bookCode;
		this.rentalStrtDate = rentalStartDt;
		this.rentalEndDate = rentalEndDt;
		this.title = bookName;
	}
	
	public Rental  build() {
		return new Rental(new RentalBookBuilder(name,bookCode,rentalStrtDate,rentalEndDate,title));
	}
	
	public RentalBookBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public RentalBookBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public RentalBookBuilder bookCode(String bookCode) {
		this.bookCode = bookCode;
		return this;
	}
	public RentalBookBuilder rentalStartDate(String date) {
		LocalDate ldt = null;
		if("".equals(date) || date == null) {
			ldt = LocalDate.now();
		}else {
			String df = new SimpleDateFormat("yyyy-MM-dd").format(date);
			try {
				ldt = LocalDate.parse(df);
			}catch(Exception e) {
				System.out.println("데이터 형식이 잘못되었습니다.");
			}
		}
		this.rentalStrtDate = ldt;
		return this;
	}
	
	public RentalBookBuilder rentalEndDate(String endDate) {
		LocalDate ldt = null;
		if("".equals(endDate) || endDate == null) {
			ldt = LocalDate.now().plusDays(14);
		}else {
			try {
				ldt = LocalDate.parse(endDate);
			}catch(Exception e) {
				System.out.println("데이터 형식이 잘못되었습니다.");
			}
		}
		this.rentalEndDate = ldt;
		return this;
	}
	

	protected String getName() {
		return name;
	}

	protected String getBookCode() {
		return bookCode;
	}

	protected LocalDate getRentalStrtDate() {
		return rentalStrtDate;
	}

	protected LocalDate getRentalEndDate() {
		return rentalEndDate;
	}

	public String getTitle() {
		return title;
	}
	
	
	
	

}
