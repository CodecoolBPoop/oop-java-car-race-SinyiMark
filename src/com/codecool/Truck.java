package com.codecool;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Vechile{
    boolean broken = false;
    int breakdownTurnsLeft = 0;

    Truck() {
        createName();
        setNormalSpeed();
    }

    public void moveForAnHour(Race race) {
        distanceTraveled = distanceTraveled + normalSpeed;
    }

    public boolean brokenCheck(){
        if (!broken){
            if (ThreadLocalRandom.current().nextInt(21) == 1) {
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

    @Override
    public void createName() {
       name = String.valueOf(ThreadLocalRandom.current().nextInt(1001));
    }

    @Override
    public void setNormalSpeed() {
        normalSpeed = 100;
    }
}

