package org.example;

import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[5];
        float somme = 0, plusGrande, plusPetite;

        for (int i = 0; i < 5; i++) {
            System.out.print("Saisir la valeur N°" + (i + 1) + ": ");
            numbers[i] = scanner.nextFloat();
        }

        plusGrande = numbers[0];
        plusPetite = numbers[0];

        for (float item : numbers) {
            somme += item;

            if (item < plusPetite) {
                plusPetite = item;
            }

            if (item > plusGrande) {
                plusGrande = item;
            }
        }

        System.out.println("La moyenne est: " + (somme / numbers.length));
        System.out.println("La plus grande valeur est: " + plusGrande);
        System.out.println("La plus petite valeur est: " + plusPetite);
    }
}
