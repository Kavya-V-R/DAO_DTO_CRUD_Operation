package com.xworkz.SmartWatchCRUD.DAO;

import com.xworkz.SmartWatchCRUD.DTO.SmartWatchDto;

public class SmartWatchDao {
	SmartWatchDto smartWatch[] = new SmartWatchDto[5];
	int index = 0;

	public SmartWatchDao() {
		System.out.println("smart watch dao created");
	}

	public void saveDto(SmartWatchDto dto) {
		System.out.println("inside the save method");
		smartWatch[index] = dto;
		index++;
	}

	public void diplayInfo() {
		for (int i = 0; i < smartWatch.length; i++) {
			System.out.println(smartWatch[i].getBrand());
			System.out.println(smartWatch[i].getColour());
			System.out.println(smartWatch[i].getSerialNumber());
			System.out.println(smartWatch[i].getPrice());
			System.out.println("------------------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brandName)) {
				System.out.println(smartWatch[i].getBrand());
				System.out.println(smartWatch[i].getColour());
				System.out.println(smartWatch[i].getSerialNumber());
				System.out.println(smartWatch[i].getPrice());
				System.out.println("------------------------------");
			}
		}
	}

	public void updateByBrand(String brand, int newprice) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brand)) {
				smartWatch[i].setPrice(newprice);
			}
		}

	}

	public void updateBrandNameByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brand)) {
				smartWatch[i].setBrand(newBrandName);
			}
		}
	}

	public void deleteByBrand(String brand) {
		for (int i = 0; i < smartWatch.length; i++) {
			if (smartWatch[i].getBrand().equals(brand)) {
				smartWatch[i] = null;
			}

		}
	}
}