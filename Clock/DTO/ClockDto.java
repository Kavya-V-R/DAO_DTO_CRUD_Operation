package com.xworkz.Clock.DTO;

public class ClockDto {
	private String brand;
	private String colour;
	private String shape;
	private int price;

	public ClockDto(String brand, String colour, String shape, int price) {
		System.out.println("inside the dto constructor");
		this.brand = brand;
		this.colour = colour;
		this.shape = shape;
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
