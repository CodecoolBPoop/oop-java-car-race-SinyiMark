package com.codecool;

import java.util.Random;

public class Motorcycle extends Vechile {
    static int motorCount = 1;
    int normalSpeed;
    String name;
    int distanceTraveled;
    Random random = new Random();

    Motorcycle(){
        name = "Motorcycle" + String.valueOf(motorCount);
        motorCount ++;
        normalSpeed = 100;
    }
    public void moveForAnHour(Race race) {
        if (race.getisRaining()) {
            distanceTraveled = distanceTraveled + normalSpeed - (random.nextInt(51) + 5);
        } else {
            distanceTraveled = distanceTraveled + normalSpeed;
        }
    }
    public void printResult() {
        System.out.print("Name: ");
        System.out.print(name);
        System.out.print(" Travled: ");
        System.out.print(distanceTraveled);
        System.out.print(" km");
        System.out.println("");
    }

}
