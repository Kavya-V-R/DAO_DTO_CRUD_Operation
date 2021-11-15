package com.xworkz.Clock.DAO;

import com.xworkz.Clock.DTO.ClockDto;

public class ClockDao {
	ClockDto clock[] = new ClockDto[4];
	int index = 0;

	public ClockDao() {
		System.out.println("Clock dao created");
	}

	public void saveDto(ClockDto dto) {
		System.out.println("inside the method");
		clock[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < clock.length; i++) {
			System.out.println(clock[i].getBrand());
			System.out.println(clock[i].getColour());
			System.out.println(clock[i].getShape());
			System.out.println(clock[i].getPrice());
			System.out.println("-------------------");
		}
	}

	public void displayByShape(String shapeName) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getShape().equals(shapeName)) {
				System.out.println(clock[i].getBrand());
				System.out.println(clock[i].getColour());
				System.out.println(clock[i].getShape());
				System.out.println(clock[i].getPrice());
				System.out.println("-------------------");
			}
		}
	}

	public void updatePriceByshape(String shape, int newprice) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getShape().equals(shape)) {
				clock[i].setPrice(newprice);
			}
		}
	}

	public void deleteByShape(String shape) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getShape().equals(shape)) {
				clock[i] = null;
			}
		}
	}
}