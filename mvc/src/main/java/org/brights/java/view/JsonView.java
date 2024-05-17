package org.brights.java.view;

import org.brights.java.model.Character;
import org.brights.java.model.Model;

public class JsonView implements IView{
    private Model model;

    public JsonView(Model model) {
        this.model = model;
    }
    public void show() {
        System.out.println("[");

        for (Character c : model.getCharacters()) {
            System.out.println("  {");
            System.out.println(String.format("    name: %s", c.getName()));
            System.out.println(String.format("    species: %s", c.getSpecies()));
            System.out.println(String.format("    height: %s", c.getHeight()));
            System.out.println("  },");
        }

        System.out.println("]");
    }
}
