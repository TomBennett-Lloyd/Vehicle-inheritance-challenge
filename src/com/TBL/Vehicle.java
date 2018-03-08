package com.TBL;

public class Vehicle {
    private String name;
    private String size;
    private int currdirection;
    private float currspeed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currdirection = 0;
        this.currspeed = 0;
    }

    public void changeDirection(int degrees){
        this.currdirection+=degrees;
    }

    public float changeSpeed(float speed){
        return this.currspeed+=speed;
    }

    public void stop (){ this.currspeed=0;}

    public int getDirection() {
        return currdirection;
    }

    public float getSpeed() {
        return currspeed;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
