package org.brights.java;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StarWars s = new StarWars();
        int num = 0;

        while (num != 4) {
            System.out.println("1. View data in XML format");
            System.out.println("2. View data in JSON format");
            System.out.println("3. View data in Text mode");
            System.out.println("4. Exit");
            
            num = s.getUserInput();
        }
    }
}