package org.brights.java.vehicle.builder;

import org.brights.java.vehicle.Car;

/**
 * <h1>TIP</h1>
 * * Create two classes <b>SedanCarBuilder</b> and <b>StationWagonBuilder</b>. Both should implement this interface.
 * <p>
 * The <b>SedanCarBuilder</b> should create a sedan car and the <b>StationWagonBuilder</b> should create a
 * station wagon.
 * </p>
 * The methods you see should be implemented using the builder style of Intellij.
 */
public interface IBuilder {
    public IBuilder setColor(String color) throws Exception;

    public IBuilder setSeatCovers(String seatCovers) throws Exception;

    public IBuilder setRimType() throws Exception;

    public IBuilder setRimType(String rimType) throws Exception;

    public IBuilder setFuelType(String fuelType) throws Exception;

    public IBuilder setHeadLights(String headLights) throws Exception;

    public IBuilder setTires(String tires) throws Exception;

    public Car build() throws Exception;
}
