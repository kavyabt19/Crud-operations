package com.xworkz.access.modifiers;

public class BeachOperator {

	private String name;
	 private String country =new String();
	 private String[]  beachname = new String[5];
	 private int counter =0;
	 
	 public BeachOperator() {
		 
		 this("India");
		 System.out.println("invoked default BeachOperator  ");
	 }
	 
	 public BeachOperator(String country) {
		 
		this.country=country;
		System.out.println("invoked default BeachOperator  ");
	 }
		
	public String getCountry() {
		return country;
	}
	 
	 public void addBeachName(String name) {
		 
		 System.out.println("invoked  addBeachName");
		 System.out.println("name ".concat(name));
		 if(this.counter<5) {
			 
			 this.beachname[this.counter]=name;
			 this.counter++;
		 }
		 else
		 {
			 System.err.println("array is full");
		 }
		
	 }
		 public void displayBeachNames()
		 {
			 System.out.println("invoked displayBeachName");
			 for(int i=0;i<this.beachname.length;i++)
			 {
				 String name =this.beachname[i];
				 System.out.println(name);
			 }
		 }
		 
		
	 }
	 

