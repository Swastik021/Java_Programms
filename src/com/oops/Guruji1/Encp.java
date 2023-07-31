package com.oops.Guruji1;


public class Encp {

	
	 	private String car;
	 	private int wheels;
	 	private String design;
	 	public Encp       (String c,int w,String d) {
	 		this.car = c;
	 		this.wheels = w;
	 		this.design = d;
	 	}
	 	
	 	public String getCar(){
	 		return car;
	 	}
	 	public int getWheels() {
	 		return wheels;
	 	
	 	}

	 	public String getDesign() {
	 		return design;
	 	}

	 	public void setCar(String car) {
	 		this.car =car;
	 	}
	 	public void setWheels(int wheels) {
	 		this.wheels = wheels;
	 	}

	 	public void setDesign(String design) {
	 		this.design = design;
	 	}

	 	public void show() {
	 		System.out.println("Hello car");
	 	}












	 }
 


