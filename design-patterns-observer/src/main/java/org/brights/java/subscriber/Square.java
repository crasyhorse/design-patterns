package org.brights.java.subscriber;

import java.util.List;

/**
 * <h1>TIP</h1>
 * <p>
 * This is the Square subscriber. It should implement both interfaces <b>ISubscriber</b> and <b>IShape</b>.
 * </p>
 * <p>The <b>update</b> method should:</p>
 * <ul>
 *     <li>check if there are two identical sides given by the user. Only then is it a square.</li>
 *     <li>execute <b>calculateArea</b> and <b>calculateCircumference</b></li>
 * </ul>
 * <p>If there are more than two sides given or these two sides are not identical, this class should do nothing.</p>
 * <h3>Formulas</h3>
 * <p>Square's area: a * a</p>
 * <p>Square's circumference: a * 4</p>
 */
public class Square implements ISubscriber, IShape{
    Double a;
}
