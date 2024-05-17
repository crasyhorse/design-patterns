package org.brights.java.controller;

import org.brights.java.model.Model;
import org.brights.java.view.IView;
import org.brights.java.view.View;

import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public int getUserInput() {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if (num >= 1 && num < 4) {
            IView v = view.update(num);
            v.show();
        }
        return num;
    }
}
