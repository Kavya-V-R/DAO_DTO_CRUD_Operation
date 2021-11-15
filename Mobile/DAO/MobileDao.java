package com.xworkz.Mobile.DAO;

import com.xworkz.Mobile.DTO.MobileDto;

public class MobileDao {
	public void displayMobileDao(MobileDto obj) {
		System.out.println("inside the display method");
		System.out.println(obj.getBrand());
		System.out.println(obj.getModel());
		System.out.println(obj.getColour());
		System.out.println(obj.getPrice());
	}

	public MobileDto displayMobileDto(String brand, String colour, String model, int price) {
		System.out.println("inside the display mobile Dto");
		MobileDto mobileDto = new MobileDto(brand, model, colour, price);
		return mobileDto;
	}

	public void mobileArray(MobileDto mobileArray[]) {
		System.out.println("inside the array method");
		for (int i = 0; i < mobileArray.length; i++) {
			System.out.println(mobileArray[i].getBrand());
			System.out.println(mobileArray[i].getModel());
			System.out.println(mobileArray[i].getColour());
			System.out.println(mobileArray[i].getPrice());
		}
	}
}
