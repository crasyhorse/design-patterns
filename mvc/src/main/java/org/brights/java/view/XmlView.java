package org.brights.java.view;

import org.brights.java.model.Character;
import org.brights.java.model.Model;

public class XmlView implements IView {

    private Model model;

    public XmlView(Model model) {
        this.model = model;
    }
    public void show() {
        System.out.println("<characters>");

        for (Character c : model.getCharacters()) {
            System.out.println("  <character>");
            System.out.println(String.format("    <name>%s</name>", c.getName()));
            System.out.println(String.format("    <species>%s</species>", c.getSpecies()));
            System.out.println(String.format("    <height>%s</height>", c.getHeight()));
            System.out.println("  </character>");
        }

        System.out.println("</characters>");
    }

}
