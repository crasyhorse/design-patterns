package org.brights.java;

import org.brights.java.vehicle.Car;
import org.brights.java.vehicle.builder.SedanCarBuilder;

public class Main {
    public static void main(String[] args) {
        /*
         * This is an example of how to build a sedan car.
         */
        SedanCarBuilder sedanCarBuilder = new SedanCarBuilder();

        try {
            Car sedanCar = sedanCarBuilder
                    .setColor("black")
                    .setSeatCovers("artificial leather")
                    .setRimType()
                    .setFuelType("gasoline")
                    .setHeadLights("xenon")
                    .setTires("195 65 R15 91H")
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}