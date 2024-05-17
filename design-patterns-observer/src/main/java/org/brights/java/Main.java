package org.brights.java;

import org.brights.java.publisher.GuessTheShape;
import org.brights.java.subscriber.Circle;
import org.brights.java.subscriber.Rectangle;
import org.brights.java.subscriber.Square;
import org.brights.java.subscriber.Triangle;

public class Main {
    public static void main(String[] args) {
        GuessTheShape guessTheShape = new GuessTheShape();

        //TIP
        //Please register your subscribers here!

        //TIP
        // Example of how to guess a shape
        guessTheShape.guess(4.0, 5.0, 6.0);
    }
}