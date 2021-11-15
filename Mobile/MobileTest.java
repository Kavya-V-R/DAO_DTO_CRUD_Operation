package com.xworkz.Mobile;

import com.xworkz.Mobile.DAO.MobileDao;
import com.xworkz.Mobile.DTO.MobileDto;

public class MobileTest {

	public static void main(String[] args) {
		System.out.println("inside the main main method");
		MobileDao dao = new MobileDao();

		MobileDto Redmi = new MobileDto("Redmi", "note8", "black", 10000);
		MobileDto Vivo = new MobileDto("Vivo", "V5", "white", 13000);
		MobileDto Realme = new MobileDto("Realme", "C5", "navyblue", 15000);
		MobileDto Samsung = new MobileDto("Samsung", "A1", "black", 13000);
		MobileDto Moto = new MobileDto("moto", "motog4", "silver", 15000);

		MobileDto mobileArray[] = { Redmi, Vivo, Realme, Samsung, Moto };
		dao.mobileArray(mobileArray);
	}
}
