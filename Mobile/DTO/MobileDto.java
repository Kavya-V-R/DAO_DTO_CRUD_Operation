package com.xworkz.Mobile.DTO;

public class MobileDto {
	private String brand;
	private String model;
	private String colour;
	private int price;

	public MobileDto(String brand, String model, String colour, int price) {
		System.out.println("inside the mobile dto constructor");
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
