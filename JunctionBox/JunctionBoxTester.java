package com.xworkz.JunctionBox;

import com.xworkz.JunctionBox.DAO.JunctionBoxDao;
import com.xworkz.JunctionBox.DTO.JunctionBoxDto;

public class JunctionBoxTester {

	public static void main(String[] args) {
		JunctionBoxDao junctioBoxDao = new JunctionBoxDao();

		JunctionBoxDto panasonic = new JunctionBoxDto("panasonic", "black", 5, 2000);
		junctioBoxDao.saveDto(panasonic);
		JunctionBoxDto syska = new JunctionBoxDto("syska", "blue", 2, 5000);
		junctioBoxDao.saveDto(syska);
		JunctionBoxDto murphy = new JunctionBoxDto("murphy", "red", 6, 3000);
		junctioBoxDao.saveDto(murphy);
		JunctionBoxDto kamcon = new JunctionBoxDto("kamcon", "green", 3, 3500);
		junctioBoxDao.saveDto(kamcon);
		JunctionBoxDto Avon = new JunctionBoxDto("Avon", "red", 1, 4000);
		junctioBoxDao.saveDto(Avon);

		System.out.println("before updating");
		junctioBoxDao.displayByBrandName("syska");
		junctioBoxDao.updateByBrand("syska", 4500);
		System.out.println("after updating");
		junctioBoxDao.displayByBrandName("syska");
	}
}
