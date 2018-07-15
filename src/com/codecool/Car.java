package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Vechile{

    Car(){
        createName();
        setNormalSpeed();
    }

    public void moveForAnHour(Race race) {
        if (race.getisThereABrokenTruck()) {
            distanceTraveled = distanceTraveled + 75;
        } else {
            distanceTraveled = distanceTraveled + normalSpeed;
        }
    }

    @Override
    public void createName() {
        name = randomName() + " " + randomName();
    }


    private String randomName() {
        List<String> names = Arrays.asList("Storm", "Quicksilver", "Rune", "Origin", "Deputy",
                "Falcon", "Astral", "Jazz", "Motive", "Specter",
                "Prodigy", "Portrait", "Mystery", "Serpent", "Realm", "Basilisk");

        return names.get(ThreadLocalRandom.current().nextInt(16));
    }

    @Override
    public void setNormalSpeed() {
        normalSpeed = ThreadLocalRandom.current().nextInt(80,111);
    }
}
