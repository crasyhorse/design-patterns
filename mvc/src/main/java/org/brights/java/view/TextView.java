package org.brights.java.view;

import org.brights.java.model.Character;
import org.brights.java.model.Model;

public class TextView implements IView {
    private Model model;

    public TextView(Model model) {
        this.model = model;
    }

    public void show() {
        for (Character c : model.getCharacters()) {
            System.out.println(String.format("name: %s, species: %s, height: %s", c.getName(), c.getSpecies(), c.getHeight()));
        }
    }
}
