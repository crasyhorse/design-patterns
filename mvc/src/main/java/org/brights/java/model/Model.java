package org.brights.java.model;

import java.util.List;

public class Model {
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
}
