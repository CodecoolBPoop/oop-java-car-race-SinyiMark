package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vechile{
    int normalSpeed;
    String name;
    int distanceTraveled;
    Random random = new Random();

    Car(int speed) {
        normalSpeed = speed;
        name = nameGenerator();
    }

    public void moveForAnHour(Race race) {
        if (race.getisThereABrokenTruck()) {
            distanceTraveled = distanceTraveled + 75;
        } else {
            distanceTraveled = distanceTraveled + normalSpeed;
        }
    }

    private String nameGenerator() {

        String name;
        name = randomName() + " " + randomName();
        return name;
    }

    private String randomName() {
        List<String> names = Arrays.asList("Storm", "Quicksilver", "Rune", "Origin", "Deputy",
                "Falcon", "Astral", "Jazz", "Motive", "Specter",
                "Prodigy", "Portrait", "Mystery", "Serpent", "Realm", "Basilisk");

        return names.get(random.nextInt(16));
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
