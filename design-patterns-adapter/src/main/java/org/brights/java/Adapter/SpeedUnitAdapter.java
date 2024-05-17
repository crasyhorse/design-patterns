package org.brights.java.Adapter;

import org.brights.java.vehicles.IVehicle;

/**
 * <h1>TIP</h1>
 * This class should be able to convert from <b>mph</b> to <b>km/h</b> and from <b>kn</b> to <b>km/h</b>.
 * In short it should serve as an adapter between speed units <b>km/h</b>, <b>mph</b> and <b>kn</b>.
 *
 * <p>Implement a constructor that should take a vehicle.</p>
 * <p>Create two methods:</p>
 *
 * <ul>
 *     <li><code>public double getVelocity()</code></li>
 *     <li><code>private double convertSpeedUnit</code></li>
 * </ul>
 *
 * <p><b>convertSpeedUnit()</b> should convert the vehicles speed unit to <b>km/h</b>
 * (</b><b>mph</b> to <b>km/h</b> or <b>kn</b> to <b>km/h</b>)</p>
 * <p><b>getVelocity()</b> should return the vehicles current speed in <b>km/h</b></b></p>
 *
 * <h3>Formulas</h3>
 * <dl>
 *     <dt>mph to km/h:</dt>
 *     <dd>km/h = mph * 1,609344</dd>
 *     <dt>kn to km/h:</dt>
 *     <dd>km/h = kn * 1,852</dd>
 * </dl>
 */
public class SpeedUnitAdapter {

    private IVehicle vehicle;
    /**
     * <h1>TIP</h1>
     * Modify this constructor to fit the requirements specified above.
     */
    public SpeedUnitAdapter(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getVelocity() {
        return 0d;
    }

    private double convertSpeedUnit() {
        return 0d;
    }
}
