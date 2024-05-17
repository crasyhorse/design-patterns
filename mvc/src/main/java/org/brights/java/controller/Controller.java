package org.brights.java.controller;

import org.brights.java.model.Model;
import org.brights.java.view.IView;
import org.brights.java.view.JsonView;
import org.brights.java.view.TextView;
import org.brights.java.view.XmlView;

import java.util.Scanner;

public class Controller {

    private IView view;
    private Model model;

    public Controller( Model model) {
        this.model = model;
    }

    public int getUserInput() {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if (num == 1) {
            IView view = new XmlView(model);
            view.show();
        }

        if (num == 2) {
            IView view = new JsonView(model);
            view.show();
        }

        if (num == 3) {
            IView view = new TextView(model);
            view.show();
        }

        return num;
    }
}
