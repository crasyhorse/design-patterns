package org.brights.java;

public class Character {
    private final String name;
    private final Species species;
    private final Double height;

    public Character(String name, Species species, Double height) {
        this.name = name;
        this.species = species;
        this.height = height;
    }

    public Species getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public String toString() {
        return String.format("Name: %s, species: %s, height: %s", name, species, height);
    }
}