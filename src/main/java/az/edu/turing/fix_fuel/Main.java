package az.edu.turing.fix_fuel;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car(15);

        FuelStation fs = level -> (level < 5) ? 10 : 0;

        while (car.getCurrentFuelLevel() > 0) {
            car.monitorCar();
            Thread.sleep(1000);
            car.drive();

            int fuelToAdd = fs.provideFuel(car.getCurrentFuelLevel());
            if (fuelToAdd > 0) {
                car.refuel(fuelToAdd);
            }
        }
    }
}
