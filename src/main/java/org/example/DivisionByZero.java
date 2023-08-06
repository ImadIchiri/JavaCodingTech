package org.example;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int nombre1, nombre2, result;

        while (true) {
            System.out.print("Le nombre 1: ");
            nombre1 = scanner.nextInt();

            System.out.print("Le nombre 2: ");
            nombre2 = scanner.nextInt();

            try {
                result = nombre1 / nombre2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException exception) {
                System.out.println(exception);
            }
        }
    }
}
