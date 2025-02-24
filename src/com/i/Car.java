package com.i;

class Car {
 private String licensePlate;
 private String model;
 private int hours;

 public Car(String licensePlate, String model,int hours) {
     this.licensePlate = licensePlate;
     this.model = model;
     this.hours=hours;
 }

 public String getLicensePlate() {
     return licensePlate;
 }

 public String getModel() {
     return model;
 }
 
 public int getHours() {
	 return hours;
 }

 public void displayCarInfo() {
     System.out.println("Car Model: " + model + ", License Plate: " + licensePlate);
 }
}

