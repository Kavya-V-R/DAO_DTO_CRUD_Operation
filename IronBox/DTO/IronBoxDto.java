package com.xworkz.IronBox.DTO;

public class IronBoxDto {
	private String brand;
	private String colour;
	private int watt;
	private int price;

	public IronBoxDto(String brand, String colour, int watt, int price) {
		System.out.println("inside the dto constructor");
		this.brand = brand;
		this.colour = colour;
		this.watt = watt;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
