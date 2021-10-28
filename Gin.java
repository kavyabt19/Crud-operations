package com.xworkz.curd_operation;

public class Gin {

	private String brand;
	private String name = new String();// type string
	private String[] gin = new String[5];// type string array
	private int counter = 0;

	public Gin() {

		this("gin");
		System.out.println("invoked default Gin ");

	}

	public Gin(String name) {

		System.out.println("invoked default Gin");
		this.name = name;

	}

	public String getname() {
		return name;
	}

	public void addGin(String brand) {

		System.out.println("invoked default addGin");
		System.out.println(" brand ".concat(brand));
		if (this.counter < 5) {

			this.gin[this.counter] = brand;
			this.counter++;
		} else {

			System.err.println("array is full");
		}
	}

	public void displayGin() {

		System.out.println("invoked default displaygin");

		for (int i = 1; i < this.gin.length; i++) {

			String brand = this.gin[i];
			System.out.println(brand);
		}
	}

	
		
	}

