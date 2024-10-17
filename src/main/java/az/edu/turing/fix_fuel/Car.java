package az.edu.turing.fix_fuel;

// Car class
public class Car {
    private int currentFuelLevel;

    public Car(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public void monitorCar() {
        System.out.println("Current Fuel Level: " + currentFuelLevel + " Litres");
    }

    public void drive() {
        this.currentFuelLevel--;
    }

    public void refuel(int fuelAmount) {
        this.currentFuelLevel += fuelAmount;
        System.out.println("New Fuel: " + fuelAmount + " litres added. New Fuel Level: " + currentFuelLevel);
    }
}
