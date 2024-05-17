package org.brights.java;

import org.brights.java.controller.Controller;
import org.brights.java.model.Model;
import org.brights.java.view.JsonView;
import org.brights.java.view.TextView;
import org.brights.java.view.View;
import org.brights.java.view.XmlView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Model model = new Model();

        View view = new View();
        view.subscribe(1, new XmlView(model));
        view.subscribe(2, new JsonView(model));
        view.subscribe(3, new TextView(model));

        Controller controller = new Controller(model, view);

        System.out.println("1. View data in XML format");
        System.out.println("2. View data in JSON format");
        System.out.println("3. View data in Text mode");
        System.out.println("4. Exit");

        int num = 0;

        while (num != 4) {

            num = controller.getUserInput();

            System.out.println("1. View data in XML format");
            System.out.println("2. View data in JSON format");
            System.out.println("3. View data in Text mode");
            System.out.println("4. Exit");
        }
    }
}