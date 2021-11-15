package com.xworkz.JunctionBox.DTO;

public class JunctionBoxDto {
	private String brand;
	private String colour;
	private int numberOfSlotes;
	private int price;

	public JunctionBoxDto(String brand, String colour, int numberOfSlotes, int price) {
		System.out.println("inside the junction box con");
		this.brand = brand;
		this.colour = colour;
		this.numberOfSlotes = numberOfSlotes;
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

	public int getNumberOfSlotes() {
		return numberOfSlotes;
	}

	public void setNumberOfSlotes(int numberOfSlotes) {
		this.numberOfSlotes = numberOfSlotes;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
