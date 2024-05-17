package org.brights.java.subscriber;

import java.util.List;

/**
 * <h1>TIP</h1>
 * <p>
 * This is the Rectangle subscriber. It should implement both interfaces <b>ISubscriber</b> and <b>IShape</b>.
 * </p>
 * <p>The <b>update</b> method should:</p>
 * <ul>
 *     <li>check if there are two different sides given by the user. Only then is it a rectangle.</li>
 *     <li>execute <b>calculateArea</b> and <b>calculateCircumference</b></li>
 * </ul>
 * <p>If there are more than two sides given or these two sides are identical, this class should do nothing.</p>
 * <h3>Formulas</h3>
 * <p>Rectangle's area: a * b</p>
 * <p>Rectangle's circumference: 2 * a + 2 * b</p>
 */
public class Rectangle implements ISubscriber, IShape {
    Double a;
    Double b;
}
