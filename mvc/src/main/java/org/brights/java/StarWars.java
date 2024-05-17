package org.brights.java;

import java.util.List;
import java.util.Scanner;

public class StarWars {
    private List<Character> characters = List.of(
            new Character("Luke Skywalker", Species.HUMAN, 172.0),
            new Character("C-3PO", Species.DROID, 167.0),
            new Character("Han Solo", Species.HUMAN, 182.0),
            new Character("R2-D2", Species.DROID, 96.0),
            new Character("Chewbacca", Species.WOOKIEE, 218.0),
            new Character("Jabba the hutt", Species.HUTT, 343.0)
    );

    public List<Character> getCharacters() {
        return characters;
    }

    public void addCharacter(Character c) {
        this.characters.add(c);
    }

    public void removeCharacter(int i) {
        this.characters.remove(i);
    }

    public void viewXML() {
        System.out.println("<characters>");

        for (Character c : characters) {
            System.out.println("  <character>");
            System.out.println(String.format("    <name>%s</name>", c.getName()));
            System.out.println(String.format("    <species>%s</species>", c.getSpecies()));
            System.out.println(String.format("    <height>%s</height>", c.getHeight()));
            System.out.println("  </character>");
        }

        System.out.println("</characters>");
    }

    public void viewJSON() {
        System.out.println("[");

        for (Character c : characters) {
            System.out.println("  {");
            System.out.println(String.format("    name: %s", c.getName()));
            System.out.println(String.format("    species: %s", c.getSpecies()));
            System.out.println(String.format("    height: %s", c.getHeight()));
            System.out.println("  },");
        }

        System.out.println("]");
    }

    public void viewText() {
        for (Character c : characters) {
            System.out.println(String.format("name: %s, species: %s, height: %s", c.getName(), c.getSpecies(), c.getHeight()));
        }
    }

    public int getUserInput() {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if (num == 1) {
            viewXML();
        }

        if (num == 2) {
            viewJSON();
        }

        if (num == 3) {
            viewText();
        }
        return num;
    }
}
