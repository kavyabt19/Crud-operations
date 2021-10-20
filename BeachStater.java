package com.xworkz.access.modifiers;

public class BeachStater {

	public static void main(String[] args) {
		
		BeachOperator beachoperator= new BeachOperator();
		String cname=beachoperator.getCountry();
		System.out.println(cname);
		
		beachoperator.addBeachName("om beach");
		beachoperator.displayBeachNames();
		beachoperator.addBeachName("karwar beach");
		
		beachoperator.addBeachName("baga beach");
		
		beachoperator.addBeachName("nikt beach");
		beachoperator.displayBeachNames();
		
	}

}
