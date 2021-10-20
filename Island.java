package com.xworkz.curd_operation;

public class Island {

	private String name;
	private String ocean = new String();
	private String[] island = new String[5];
	private int counter;

	public Island() {

		this("Arabian Sea");
		System.out.println("Invoked default Island");

	}

	public String getOcean() {
		return ocean;
	}

	public Island(String ocean) {

		System.out.println("Invoked default Island");
		this.ocean = ocean;

	}

	public void addIsland(String name) {

		System.out.println(" invoked addIslandName");
		System.out.println(" name ".concat(name));
		if (this.counter < 5) {

			this.island[this.counter] = name;
			this.counter++;

		} else {

			System.err.println("array is full");
		}
	}

	public void displayIsland() {

		System.out.println("invoked displayislandName");
		for (int i = 0; i < this.island.length; i++) {
			String name1 = this.island[i];
			System.out.println(name1);
		}

	}

}
