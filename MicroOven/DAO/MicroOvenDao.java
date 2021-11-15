package com.xworkz.MicroOven.DAO;

import com.xworkz.MicroOven.DTO.MicroOvenDto;

public class MicroOvenDao {
MicroOvenDto microOven[]=new MicroOvenDto[3];
	int index = 0;

	public MicroOvenDao() {
		System.out.println("micro oven dao created");
	}

	public void saveDto(MicroOvenDto dto) {
		System.out.println("inside the save method");
		microOven[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < microOven.length; i++) {
			System.out.println(microOven[i].getBrand());
			System.out.println(microOven[i].getColour());
			System.out.println(microOven[i].getCapacityInLitre());
			System.out.println(microOven[i].getPrice());
			System.out.println("----------------------");

		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < microOven.length; i++) {
			if (microOven[i].getBrand().equals(brandName)) {
				System.out.println(microOven[i].getBrand());
				System.out.println(microOven[i].getColour());
				System.out.println(microOven[i].getCapacityInLitre());
				System.out.println(microOven[i].getPrice());
				System.out.println("------------------------------");
			}
		}
	}

	public void updateBrandNameByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < microOven.length; i++) {
			if (microOven[i].getBrand().equals(brand)) {
				microOven[i].setBrand(newBrandName);
			}
		}
	}

	public void deleteByBrand(String brand) {
		for (int i = 0; i < microOven.length; i++) {
			if (microOven[i].getBrand().equals(brand)) {
				microOven[i] = null;
			}

		}
	}
}
