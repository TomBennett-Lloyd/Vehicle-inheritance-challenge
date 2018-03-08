package com.TBL;

public class Car extends Vehicle {
    private int gear;
    private float revs;
    private float maxRevs;
    private int acceleration;
    private float maxSpeed;
    private int maxGear;

    public Car(String name, String size, float maxSpeed, int zeroToSixty) {
        super(name, size);
        this.gear = 1;
        this.acceleration=60/zeroToSixty;
        this.revs=10000;
        this.maxRevs=90000;
        this.maxGear = 5;
        this.maxSpeed = maxSpeed;
    }



    public boolean changegears(int gears){
        this.gear+=gears;
        if (this.gear<1){
            this.stop();
            this.revs=10000;
            return false;
        } else if(this.gear<=this.maxGear) {
            return true;
        } else {
            this.gear=this.maxGear;
            return false;
        }

    }

    private void changeRevs(float throttle){
        float revCoeff= (float)0.7;
        float rev =this.revs+(throttle*this.maxRevs*revCoeff);
        if (rev>this.maxRevs){
            boolean topSpeed=this.changegears(1);
            if (!topSpeed){
                this.revs=this.maxRevs;
            } else {
                this.revs= Math.max(rev-this.maxRevs,8000);
            }

        } else if (rev<8000){
            boolean moving=this.changegears(-1);
            if (moving){
                this.revs= this.maxRevs-rev;
            }
        } else{
            this.revs=rev;
        }
    }


    public void accellerate (float throttle, int time){
        if (throttle > 100) {
            throw new IllegalArgumentException("throttle must be a number from 1 to 100") ;
        }else{
            throttle /= 100;
        }
        for (int i = 0; i < time ; i++) {
            float speedchange = throttle*this.acceleration;
            this.changeRevs(throttle);

            if (this.changeSpeed(speedchange)>this.maxSpeed){
                this.changeSpeed(this.maxSpeed-this.getSpeed());
            } else {
                this.changeSpeed(speedchange);
            }

        }
    }


    public int getGear() {
        return gear;
    }

    public float getRevs() {
        return revs;
    }

    public float getMaxRevs() {
        return maxRevs;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }
}
