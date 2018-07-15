package com.codecool;
import java.util.concurrent.ThreadLocalRandom;

public class Motorcycle extends Vechile {
    static int motorCount = 1;


    Motorcycle(){
        createName();
        motorCount ++;
        setNormalSpeed();

    }
    public void moveForAnHour(Race race) {
        if (race.getisRaining()) {
            distanceTraveled = distanceTraveled + normalSpeed - (ThreadLocalRandom.current().nextInt(5,51));
        } else {
            distanceTraveled = distanceTraveled + normalSpeed;
        }
    }

    @Override
    public void createName() {
       name = "Motorcycle" + String.valueOf(motorCount);
    }

    @Override
    public void setNormalSpeed() {
        normalSpeed = 100;
    }
}
