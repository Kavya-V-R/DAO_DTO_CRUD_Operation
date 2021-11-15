package com.xworkz.Clock;

import com.xworkz.Clock.DAO.ClockDao;
import com.xworkz.Clock.DTO.ClockDto;

public class ClockTester {

	public static void main(String[] args) {
		ClockDao clockDao = new ClockDao();

		ClockDto ajantha = new ClockDto("ajantha", "white", "round", 2000);
		clockDao.saveDto(ajantha);
		ClockDto casio = new ClockDto("casio", "black", "square", 1500);
		clockDao.saveDto(casio);
		ClockDto safal = new ClockDto("safal", "gold", "rectangle", 2200);
		clockDao.saveDto(safal);
		ClockDto opal = new ClockDto("opal", "brown", "diamond", 1800);
		clockDao.saveDto(opal);

		System.out.println("before update");
		clockDao.displayByShape("square");
		clockDao.updatePriceByshape("square", 1800);
		System.out.println("after update");
		clockDao.displayByShape("square");

		clockDao.deleteByShape("diamond");
		clockDao.displayInfo();
	}
}
