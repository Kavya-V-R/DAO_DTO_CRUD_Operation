package com.xworkz.SmartWatchCRUD.DTO;

public class SmartWatchDto {
	
	private String brand;
	private String colour;
	private int serialNumber;
	private int price;
	public SmartWatchDto(String brand, String colour, int serialNumber, int price) {
		System.out.println("inside the smartwatch dto constructor");
		this.brand = brand;
		this.colour = colour;
		this.serialNumber = serialNumber;
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
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
