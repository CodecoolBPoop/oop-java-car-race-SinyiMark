package com.codecool;

public abstract class Vechile {
    String name;
    int normalSpeed;
    int distanceTraveled;

    public abstract void moveForAnHour(Race race);

    public abstract void createName();

    public abstract void setNormalSpeed();

    public  void printResult(){
        System.out.print("Name: ");
        System.out.print(name);
        System.out.print(" Travled: ");
        System.out.print(distanceTraveled);
        System.out.print(" km");
        System.out.println("");
    }

}

