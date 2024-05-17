package org.brights.java.subscriber;

import java.util.List;

/**
 * <h1>TIP</h1>
 * <p>
 * This is the Triangle subscriber. It should implement both interfaces <b>ISubscriber</b> and <b>IShape</b>.
 * </p>
 * <p>The <b>update</b> method should:</p>
 * <ul>
 *     <li>check if there are three sides given by the user. Only then is it a triangle.</li>
 *     <li>execute <b>calculateArea</b> and <b>calculateCircumference</b></li>
 * </ul>
 * <p>If there are more than three sides given, this class should do nothing.</p>
 * <h3>Formulas</h3>
 * <p>Triangle's area: SQRT(( u / 2) * (u / 2 - a) * (u / 2 - b) * (u / 2 - c)</p>
 * <p>Triangle's circumference: a + b + c</p>
 * <p><b>HINT:</b> u = triangle's circumference</p>
 */
public class Triangle implements ISubscriber, IShape {
    private Double a;
    private Double b;
    private Double c;
}
