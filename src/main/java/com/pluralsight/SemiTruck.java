package com.pluralsight;

/**
 * SemiTruck (Workbook 5a, Section 1-2 Simple Inheritance, Exercise 2)
 *
 * A child class of Vehicle: a SemiTruck IS a Vehicle. It inherits every
 * public member of Vehicle and adds what is special about a semi truck:
 * the number of trailers and loading and unloading cargo.
 */
public class SemiTruck extends Vehicle {
    // Only a semi truck has this, so it lives here and not in Vehicle
    private int numberOfTrailers;

    // Constructor the calls unique field and uses super constructor
    public SemiTruck(String model, int cargoCapacity, int numberOfPassengers, int fuelCapacity, int topSpeed, String color, int numberOfTrailers) {
        super(model, cargoCapacity, numberOfPassengers, fuelCapacity, topSpeed, color);
        this.numberOfTrailers = numberOfTrailers;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    // Actions only a semi truck has
    public void loadCargo() {
        System.out.println("Cargo loaded onto the truck.");
    }

    public void unloadCargo() {
        System.out.println("Cargo unloaded from the truck.");
    }
}