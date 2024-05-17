package org.brights.java.vehicle;

import java.util.List;

/**
 * <h1>TIP</h1>
 * This class should have a simple constructor that assigns its parameters to its instance variables.
 *
 * <p>
 * No assertions should be made and no exception should be thrown. Remove the <b>colorPalette</b> instance
 * variable if you do not need it anymore.
 * </p>
 * <p>
 * <b>HINT:</b> Do not just delete this code. You will need it to create the builder classes. You may remove
 * the unneeded code after that.
 * </p>
 */
public class Car {

    private final String model;
    private final String color;
    private final String seatCovers;
    private final String rimType;
    private final String fuelType;
    private final String headLights;
    private final String tires;

    private final List<String> colorPalette =
            List.of("black", "maroon", "green", "olive", "navy",
                    "purple", "teal", "silver", "gray", "red", "lime", "yellow", "blue", "fuchsia",
                    "aqua", "white"
            );

    /**
     * Creates a Car with a lot of parameters.
     *
     * @param model      The car's model. Could be "sedan car", "station wagon"
     * @param color      The car's color. Could be any color of the Microsoft Windows and IBM OS/2 default 16-color palette.
     * @param seatCovers The material used to cover the car seats. Could be "leather", "artificial leather", "fiber"
     * @param rimType    The car's rims should be made of this material. Could be "steel", "alu"
     * @param fuelType   The car should run with this type of fuel. Could be "gasoline", "diesel", "CNG"
     * @param headLights The car should be fitted with this type of headlight. Could be "xenon", "halogen"
     * @param tires      The car should have one of these types of tires. Could be "195 65 R15 91H" or "195 65 R15 91V"
     */
    public Car(String model, String color, String seatCovers, String rimType, String fuelType, String headLights, String tires) throws Exception {
        if (!List.of("sedan car", "station wagon").contains(model)) {
            throw new Exception("A car must be of type 'sedan car' or 'station wagon'!");
        }

        this.model = model;

        if (!colorPalette.contains(color)) {
            throw new Exception("Wrong color. We have only 16 colors for our cars.");
        }
        this.color = color;

        if (!List.of("leather", "artificial leather", "fiber").contains(seatCovers)) {
            throw new Exception("A car must have one of the following types of seat covers: 'leather', 'artificial leather' or 'fiber'!");
        }

        if (model.equals("sedan car") && !List.of("artificial leather", "fiber").contains(seatCovers)) {
            throw new Exception("A sedan car can be delivered with seat covers made of artificial leather or synthetic fiber only!");
        }

        if (model.equals("station wagon") && !List.of("leather", "artificial leather").contains(seatCovers)) {
            throw new Exception("A station wagon can be deliver with seat covers made of leather or artificial leather only!");
        }

        this.seatCovers = seatCovers;

        if (!List.of("steel", "alu").contains(rimType)) {
            throw new Exception("The rim type must be 'steel' or 'alu'!");
        }

        if (model.equals("sedan car") && !rimType.equals("alu")) {
            throw new Exception("The rims of a sedan car can be made of alu only!");
        }

        this.rimType = rimType;

        if (!List.of("gasoline", "diesel", "CNG").contains(fuelType)) {
            throw new Exception("The fuel type must be 'gasoline', 'diesel' or 'CNG'!");
        }

        this.fuelType = fuelType;

        if (!List.of("xenon", "halogen").contains(fuelType)) {
            throw new Exception("Our cars can have 'xenon' or 'halogen' head lights only!");
        }

        this.headLights = headLights;

        if (!List.of("195 65 R15 91H", "195 65 R15 91V").contains(tires)) {
            throw new Exception("Wrong type of tires used! The tire type must be '195 65 R15 91H' or '195 65 R15 91V'!");
        }

        if (model.equals("sedan car") && tires.equals("195 65 R15 91H") && !List.of("gasoline", "diesel").contains(fuelType)) {
            throw new Exception("A sedan car with 196 65 R15 91H tires can be ordered with gasoline or diesel only but not with CNG fuel type!");
        }

        this.tires = tires;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getSeatCovers() {
        return seatCovers;
    }

    public String getRimType() {
        return rimType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getHeadLights() {
        return headLights;
    }

    public String getTires() {
        return tires;
    }
}
