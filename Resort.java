package com.xworkz.curd_operation;

public class Resort {

	private String Rname;
	private String Rlocation = new String();
	private String[] resort = new String[5];
	private int counter;

	public Resort() {

		this("Madikeri");
		System.out.println("Invoked default Resort");

	}

	public String getRlocation() {
		return Rlocation;
	}

	public Resort(String Rlocation) {

		System.out.println("Invoked default Resort");
		this.Rlocation = Rlocation;

	}

	public void addResort(String Rname) {

		System.out.println(" invoked addResortt");
		System.out.println(" name ".concat(Rname));
		if (this.counter < 5) {

			this.resort[this.counter] = Rname;
			this.counter++;

		} else {

			System.err.println("array is full");
		}
	}

	public void displayResort() {

		System.out.println("invoked displayResort");
		for (int i = 0; i < this.resort.length; i++) {
			String name1 = this.resort[i];
			System.out.println(name1);
		}

	}

}
