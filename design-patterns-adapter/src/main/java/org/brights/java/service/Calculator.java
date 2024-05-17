package org.brights.java.service;

import org.brights.java.vehicles.IVehicle;

/**
 * <h1>TIP</h1>
 * This class should be able to calculate the distance traveled in <b>km</b> or the time required
 * for every given vehicle.
 *
 * <p>Create two methods:</p>
 *
 * <ul>
 *     <li><code>public double getDistanceTraveled(double t)</code></li>
 *     <li><code>public double getTimeRequired(double d)</code></li>
 * </ul>
 *
 * <h3>Units</h3>
 * <ul>
 *     <li>Velocity: <b>v</b></li>
 *     <li>Distance: <b>d</b></li>
 *     <li>Time: <b>t</b></li>
 * </ul>
 *
 * <h3>Formulas</h3>
 * <dl>
 *     <dt>Distance traveled:</dt>
 *     <dd>d = v * t</dd>
 *     <dt>Time required:</dt>
 *     <dd>t = d / v</dd>
 * </dl>
 *
 * <p><b>HINT:</b>To be able to calculate the distance traveled in <b>km</b>> you need to get a vehicle's
 * current speed in <b>km/h</b>.</p>
 */
public class Calculator {

    /**
     * <h1>TIP</h1>
     * The vehicle should be encapsulated by the SpeedUnitAdapter class because
     * we need the vehicle's speed in km/h.
     *
     * @param vehicle The vehicle to be used to calculate its distance traveled or its time required.
     */
    public Calculator(IVehicle vehicle){

    }
}
