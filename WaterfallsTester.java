package com.xworkz.curd_operation;

public class WaterfallsTester {

	public static void main(String[] args) {

		Waterfalls waterfalls = new Waterfalls();
		String cname = waterfalls.getPlace();
		System.out.println(cname);

		waterfalls.addWaterfalls("Jog Falls ");
		waterfalls.addWaterfalls("Shivanasamudra");
		waterfalls.addWaterfalls("Hebbe ");
		waterfalls.addWaterfalls("Sathodi");
		waterfalls.addWaterfalls("Kunchikal ");

		waterfalls.displayWaterfalls();
	}

}
