package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {
    Random random = new Random();
    private boolean isRaining;
    private boolean isThereABrokenTruck = false;
    List<Car> Cars;
    List<Truck> Trucks;
    List<Motorcycle> Motorcycles;

    public static void main(String[] args) {
	// write your code here
        Race race = new Race();
        race.simulateRace();

    }
    Race(){
        createVehicles();
    }

    private void createVehicles(){
        Cars = new ArrayList<>();
        Trucks = new ArrayList<>();
        Motorcycles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Cars.add(new Car(random.nextInt(31) + 80));
            Trucks.add(new Truck());
            Motorcycles.add(new Motorcycle());
        }

    }
    public void simulateRace(){
        for (int i = 0; i < 50 ; i++) {
            oneHour();
        }
        printRaceResults();


    }
    private void oneHour(){
        boolean isOneBroken = false;
        setRaining();
        for (Truck truck:Trucks) {
            if (truck.brokenCheck()) {
                isOneBroken = true;
            } else {
                truck.moveForAnHour(this);
            }
            if (isOneBroken) {
                isThereABrokenTruck = true;
                isOneBroken = false;
            }
        }
        for(Car car:Cars){
            car.moveForAnHour(this);
        }
        for (Motorcycle motor: Motorcycles){
            motor.moveForAnHour(this);
        }
    }
    private void  printRaceResults(){
        System.out.println("Trucks");
        for (Truck truck:Trucks) {
            truck.printResult();
        }
        System.out.println("Cars");
        for (Car car:Cars) {
            car.printResult();
        }
        System.out.println("Motorcycle");
        for(Motorcycle motorcycle:Motorcycles){
            motorcycle.printResult();
        }
    }

    private void setRaining(){
        int rainChance = random.nextInt(11);
        if (rainChance<4){
            isRaining = true;
        }else {
            isRaining = false;
        }
    }

    public boolean getisThereABrokenTruck(){
        return isThereABrokenTruck;
    }

    public boolean getisRaining(){
        return isRaining;
    }
}
