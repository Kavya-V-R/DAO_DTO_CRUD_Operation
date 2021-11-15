package com.xworkz.MicroOven;

import com.xworkz.MicroOven.DAO.MicroOvenDao;
import com.xworkz.MicroOven.DTO.MicroOvenDto;

public class MicroOvenTester {

	public static void main(String[] args) {
		MicroOvenDao microOvenDao = new MicroOvenDao();

		MicroOvenDto bajaj = new MicroOvenDto("bajaj", "blue", 20, 5000);
		microOvenDao.saveDto(bajaj);
		MicroOvenDto LG = new MicroOvenDto("LG", "red", 32, 8000);
		microOvenDao.saveDto(LG);
		MicroOvenDto godrej = new MicroOvenDto("godrej", "green", 27, 9500);
		microOvenDao.saveDto(godrej);

		System.out.println("before updating");
		microOvenDao.displayByBrandName("bajaj");
		microOvenDao.updateBrandNameByBrandName("bajaj", "bajaj2");
		System.out.println("after updating");
		microOvenDao.displayByBrandName("bajaj2");
	}

}
