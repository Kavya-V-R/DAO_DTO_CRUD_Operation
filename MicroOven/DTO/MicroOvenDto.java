package com.xworkz.MicroOven.DTO;

public class MicroOvenDto {
	private String brand;
	private String colour;
	private int capacityInLitre;
	private int price;

	public MicroOvenDto(String brand, String colour, int capacityInLitre, int price) {
		System.out.println("inside the micro oven dto");
		this.brand = brand;
		this.colour = colour;
		this.capacityInLitre = capacityInLitre;
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

	public int getCapacityInLitre() {
		return capacityInLitre;
	}

	public void setCapacityInLitre(int capacityInLitre) {
		this.capacityInLitre = capacityInLitre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
