package com.xworkz.JunctionBox.DAO;

import com.xworkz.JunctionBox.DTO.JunctionBoxDto;

public class JunctionBoxDao {
	JunctionBoxDto junctionBox[] = new JunctionBoxDto[5];
	int index = 0;

	public JunctionBoxDao() {
		System.out.println("smart watch dao created");
	}

	public void saveDto(JunctionBoxDto dto) {
		System.out.println("inside the save method");
		junctionBox[index] = dto;
		index++;
	}

	public void diplayInfo() {
		for (int i = 0; i < junctionBox.length; i++) {
			System.out.println(junctionBox[i].getBrand());
			System.out.println(junctionBox[i].getColour());
			System.out.println(junctionBox[i].getNumberOfSlotes());
			System.out.println(junctionBox[i].getPrice());
			System.out.println("------------------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		for (int i = 0; i < junctionBox.length; i++) {
			if (junctionBox[i].getBrand().equals(brandName)) {
				System.out.println(junctionBox[i].getBrand());
				System.out.println(junctionBox[i].getColour());
				System.out.println(junctionBox[i].getNumberOfSlotes());
				System.out.println(junctionBox[i].getPrice());
				System.out.println("------------------------------");
			}
		}
	}

	public void updateByBrand(String brand, int newprice) {
		for (int i = 0; i < junctionBox.length; i++) {
			if (junctionBox[i].getBrand().equals(brand)) {
				junctionBox[i].setPrice(newprice);
			}
		}

	}

	public void updateBrandNameByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < junctionBox.length; i++) {
			if (junctionBox[i].getBrand().equals(brand)) {
				junctionBox[i].setBrand(newBrandName);
			}
		}
	}

	public void deleteByBrand(String brand) {
		for (int i = 0; i < junctionBox.length; i++) {
			if (junctionBox[i].getBrand().equals(brand)) {
				junctionBox[i] = null;
			}

		}
	}
}
