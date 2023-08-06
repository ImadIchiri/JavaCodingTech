package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        final List<String> OPERATIONS = new ArrayList<>(Arrays.asList("+", "-", "x", "/"));

        while (true) {
            System.out.println("Liste des choix: ");
            System.out.println(
                    "1- Adition (+) \n"
                            + "2- Soustraction (-) \n"
                            + "3- Multiplication (x) \n"
                            + "4- Division (/) \n"
            );

            while (true) {
                System.out.print("Entrer L'operation: ");
                operation = scanner.next();

                if (OPERATIONS.contains(operation)) {
                    break;
                } else {
                    System.out.println("Invalid Operation!");
                }
            }

            System.out.print("Entrer Le premier nombre: ");
            double nbre1 = scanner.nextDouble();

            System.out.print("Entrer Le deuxieme nombre: ");
            double nbr2 = scanner.nextDouble();

            System.out.println("Le resultat est: " + result(operation, nbre1, nbr2));

            System.out.println("Quitter le programme (y/n): ");
            if (scanner.next().equalsIgnoreCase("y")) {
                break;
            }
        }

    }


    public static double result(String operation, double n1, double n2) {
        switch (operation) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "x":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                System.out.println("Invalid Operation");
                return 0;
        }
    }
}