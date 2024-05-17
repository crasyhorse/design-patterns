package org.brights.java.subscriber;

import java.util.List;

/**
 * <h1>TIP</h1>
 * <p>
 * This is the Circle subscriber. It should implement both interfaces <b>ISubscriber</b> and <b>IShape</b>.
 * </p>
 * <p>The <b>update</b> method should:</p>
 * <ul>
 *     <li>check if there is only one side given by the user. This side is then interpreted as the circle's radius.</li>
 *     <li>execute <b>calculateArea</b> and <b>calculateCircumference</b></li>
 * </ul>
 * <p>If there is more than one side given, this class should do nothing.</p>
 * <h3>Formulas</h3>
 * <p>Circle's area: r * r * PI</p>
 * <p>Circle's circumference: 2 * r * PI</p>
 */
public class Circle {
    private Double radius;
}
