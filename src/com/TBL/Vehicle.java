package com.TBL;

public class Vehicle {
    private String name;
    private String size;
    private int currdirection;
    private int currspeed;

    public Vehicle(String name, String size, int currdirection, int currspeed) {
        this.name = name;
        this.size = size;
        currdirection = currdirection;
        currspeed = currspeed;
    }

    public void changeDirection(int degrees){
        this.currdirection+=degrees;
    }

    public void changeSpeed(int speed){
        this.currspeed+=speed;
    }

    public void stop (){ this.currspeed=0;}

    public int getDirection() {
        return currdirection;
    }

    public int getSpeed() {
        return currspeed;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
