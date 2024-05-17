package org.brights.java.publisher;

import org.brights.java.subscriber.ISubscriber;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * <h1>TIP</h1>
 * <p>
 * This class should work a publisher who publishes events to its observers / subscribers.
 * </p>
 * <p>
 * It should have a Map&lt;String, ISubscriber&gt; of its subscribers.
 * </p>
 * <p>You should implement:</p>
 * <ul>
 *     <li>A method <b>notifySubscribers(List&lt;Double&gt; sides)</b> that notifies all the subscribers.</li>
 *     <li>A method <b>subscribe()</b> that allows an observer / a subscriber to register itself by the publisher.</li>
 *     <li>A method <b>unsubscribe</b> that makes it possible to remove a subscriber from the publisher by using its name.</li>
 * </ul>
 * <p>The method <b>guess(Double... sides)</b> should add all sides to a List<Double> sides and then call <b>notifySubscribers()</b>.</p>
 */
public class GuessTheShape {

    Map<String, ISubscriber> subscribers;
    List<Double> sides;

    public GuessTheShape() {
        subscribers = new HashMap<>();
    }

    public void guess(Double... sides) {
       this.sides = new ArrayList<>();

        for (Double point : sides) {
            this.sides.add(point);
        }

        notifySubscribers();
    }

    public void notifySubscribers() {
        for(ISubscriber subscriber : subscribers.values()) {
            subscriber.update(sides);
        }
    }

    public void subscribe(String name, ISubscriber subscriber) {
        subscribers.put(name, subscriber);
    }

    public void unsubscribe(String name) {
        subscribers.remove(name);
    }
}
