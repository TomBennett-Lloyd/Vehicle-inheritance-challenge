package com.TBL;

public class Main {

    public static void main(String[] args) {
        Car fordCMax = new Car("FordCmax","Estate",100,12);

        for (int i=0;i<3;i++){
            fordCMax.accellerate(100,2);
            System.out.println("speed is "+fordCMax.getSpeed());
            System.out.println("gear is "+fordCMax.getGear());
            System.out.println("Revs are "+fordCMax.getRevs());
            fordCMax.changeDirection(20);
            System.out.println("Direction is "+fordCMax.getDirection());
            System.out.println("");
        }

    }
}
