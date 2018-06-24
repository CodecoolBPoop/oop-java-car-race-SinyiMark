package com.codecool;

import java.util.Random;

public class Truck extends Vechile{
    int normalSpeed;
    int name;
    int distanceTraveled;
    boolean broken = false;
    int breakdownTurnsLeft = 0;
    Random random = new Random();

    Truck() {
        normalSpeed = 100;
        name = nameGenerator();
    }

    public void moveForAnHour(Race race) {
        distanceTraveled = distanceTraveled + normalSpeed;
    }

    public boolean brokenCheck(){
        if (!broken){
            if (random.nextInt(21) == 1) {
                broken = true;
                breakdownTurnsLeft = 2;
            }
        }else {
            breakdownTurnsLeft --;
            if (breakdownTurnsLeft == 0){
                broken = false;
            }
        }
        return broken;
    }

    private int nameGenerator(){
        int name = random.nextInt(1001);
        return name;
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

