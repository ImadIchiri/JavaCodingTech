package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Donnez un nombre positif: ");
            nombre = scanner.nextInt();

            if (nombre <= 0) {
                System.out.println("Svp un nombre positif !");
            } else {
                System.out.println("Sa racine carree est: " + Math.sqrt(nombre));
            }
        } while (nombre != 0);
    }
}
