package org.brights.java;

import org.brights.java.service.Calculator;
import org.brights.java.vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        /*
         * This is an example of how to calculate the distance traveled of a Motorcycle object.
         */
        Motorcycle motorcycle = new Motorcycle(120.0d, "mph");
        Calculator calculator = new Calculator(motorcycle);

        double hours = 3d;
        double distanceTraveled = calculator.getDistanceTraveled(hours);
        System.out.println("The motorcycle has traveled " + distanceTraveled + " km in " + hours + " hours.");
    }
}