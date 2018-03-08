package com.TBL;

public class Car extends Vehicle {
    private int gear;
    private int power;
    private int revs;
    private int maxRevs;

    public Car(String name, String size, int currdirection, int currspeed, int gear, int power,int revs,int maxRevs) {
        super(name, size, currdirection, currspeed);
        this.gear = gear;
        this.power = power;
        this.revs=revs;
        this.maxRevs=maxRevs;
    }



    public void changegears(int gears){
        this.gear+=gears;

    }

    private int availablePower(){
        int avialable = -1*(Math.abs(this.revs-this.maxRevs)/this.maxRevs)+1;
        return avialable;

    }


    public void accellerate (int throttle, int time){
        int speedchange = throttle*this.availablePower()*time;
        this.changeSpeed(speedchange);
    }



}
