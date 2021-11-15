package com.xworkz.IronBox;

import com.xworkz.IronBox.DAO.IronBoxDao;
import com.xworkz.IronBox.DTO.IronBoxDto;

public class IronBoxTester {

	public static void main(String[] args) {
		IronBoxDao ironBoxDao = new IronBoxDao();

		
		IronBoxDto bajaj = new IronBoxDto("bajaj", "blue", 900, 5000);
		ironBoxDao.saveDto(bajaj);
		IronBoxDto usha = new IronBoxDto("usha", "red", 800, 3000);
		ironBoxDao.saveDto(usha);
		IronBoxDto mannercraft = new IronBoxDto("mannercraft", "green", 750, 3500);
		ironBoxDao.saveDto(mannercraft);
		IronBoxDto philips = new IronBoxDto("philips", "green", 1000, 4000);
		ironBoxDao.saveDto(philips);

		System.out.println("before updating");
		ironBoxDao.displayByBrandName("bajaj");
		ironBoxDao.updateBrandNameByBrandName("bajaj", "bajaj2");
		System.out.println("after updating");
		ironBoxDao.displayByBrandName("bajaj2");
	}

}
