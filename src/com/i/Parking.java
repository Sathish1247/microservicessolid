package com.i;

public class Parking implements ParkingLot {
	    private int totalCapacity;
	    private int availableSpots;

	    // Constructor
	    public Parking(int totalCapacity) {
	        this.totalCapacity = totalCapacity;
	        this.availableSpots = totalCapacity;
	    }

	    // Decrease available spots when a car is parked
	    @Override
	    public void parkCar() {
	        if (availableSpots > 0) {
	            availableSpots--;
	            System.out.println("Car parked. Available spots: " + availableSpots);
	        } else {
	            System.out.println("Parking lot full! No spots available.");
	        }
	    }

	    // Increase available spots when a car is unparked
	    @Override
	    public void unparkCar() {
	        if (availableSpots < totalCapacity) {
	            availableSpots++;
	            System.out.println("Car unparked. Available spots: " + availableSpots);
	        } else {
	            System.out.println("All spots are already free.");
	        }
	    }

	    // Return the current available spots
	    @Override
	    public void getCapacity() {
	        System.out.println("Remaining capaity is "+availableSpots);
	    }
	    
	    @Override
	    public double calculateFee(Car car) {
	        double fee = car.getHours() * 50;
	        System.out.println("Parking fee for " + car.getModel() + " (" + car.getLicensePlate() + ") for " + car.getHours() + " hours: $" + fee);
	        return fee;
	    }
	    
	    public static void main(String[] args) {
	        ParkingLot parking = new Parking(5); 

	        Car car1 = new Car("KA-01-AB-1234", "Tesla Model S",3);
	        Car car2 = new Car("AP-02-CD-5678", "BMW X5",5);
	        car1.displayCarInfo();
	        car2.displayCarInfo();
	        parking.calculateFee(car1);
	        parking.calculateFee(car2);
	        //sample comment
	    }
}


