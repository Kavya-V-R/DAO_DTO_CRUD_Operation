package com.xworkz.IronBox.DAO;

import com.xworkz.IronBox.DTO.IronBoxDto;

public class IronBoxDao {
	IronBoxDto ironBox[] = new IronBoxDto[4];
	int index = 0;

	public IronBoxDao() {
		System.out.println("iron box dao created");
	}

	public void saveDto(IronBoxDto dto) {
		System.out.println("inside the save method");
		ironBox[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < ironBox.length; i++) {
			System.out.println(ironBox[i].getBrand());
			System.out.println(ironBox[i].getColour());
			System.out.println(ironBox[i].getWatt());
			System.out.println(ironBox[i].getPrice());
			System.out.println("----------------------");

		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < ironBox.length; i++) {
			if (ironBox[i].getBrand().equals(brandName)) {
				System.out.println(ironBox[i].getBrand());
				System.out.println(ironBox[i].getColour());
				System.out.println(ironBox[i].getWatt());
				System.out.println(ironBox[i].getPrice());
				System.out.println("------------------------------");
			}
		}
	}

	public void updateBrandNameByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < ironBox.length; i++) {
			if (ironBox[i].getBrand().equals(brand)) {
				ironBox[i].setBrand(newBrandName);
			}
		}
	}

	public void deleteByBrand(String brand) {
		for (int i = 0; i < ironBox.length; i++) {
			if (ironBox[i].getBrand().equals(brand)) {
				ironBox[i] = null;
			}

		}
	}
}
