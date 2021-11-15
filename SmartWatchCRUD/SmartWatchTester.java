package com.xworkz.SmartWatchCRUD;

import com.xworkz.SmartWatchCRUD.DAO.SmartWatchDao;
import com.xworkz.SmartWatchCRUD.DTO.SmartWatchDto;

public class SmartWatchTester {

	public static void main(String[] args) {
		SmartWatchDao smartWatchDao = new SmartWatchDao();

		SmartWatchDto mi = new SmartWatchDto("mi", "black", 123, 2000);
		smartWatchDao.saveDto(mi);
		SmartWatchDto Samsung = new SmartWatchDto("Samusng", "blue", 456, 5000);
		smartWatchDao.saveDto(Samsung);
		SmartWatchDto fossil = new SmartWatchDto("fossil", "red", 789, 3000);
		smartWatchDao.saveDto(fossil);
		SmartWatchDto noise = new SmartWatchDto("noise", "green", 321, 3500);
		smartWatchDao.saveDto(noise);
		SmartWatchDto oneplus = new SmartWatchDto("oneplus", "red", 654, 4000);
		smartWatchDao.saveDto(oneplus);

		System.out.println("before updating");
		smartWatchDao.displayByBrandName("fossil");
		smartWatchDao.updateByBrand("fossil", 2000);
		System.out.println("after updating");
		smartWatchDao.displayByBrandName("fossil");
	}
}
