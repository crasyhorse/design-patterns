package org.brights.java.vehicles;

public interface IVehicle {

    /**
     * Returns the vehicles current velocity.
     *
     * @return The vehicles current velocity
     */
    public double getVelocity();

    /**
     * Returns the speed unit used by the vehicle as string.
     *
     * @return Returns <b>km/h</b>, <b>mph</b> or <b>kn</b>
     */
    public String getSpeedUnit();
}
