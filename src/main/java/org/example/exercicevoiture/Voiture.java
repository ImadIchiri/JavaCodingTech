package org.example.exercicevoiture;

public class Voiture {
    private String marque;
    private static int nbr = 0;

    public Voiture(String marque) {
        this.marque = marque;
        nbr++;
    }

    public static int getNombreDesVoitures() {
        return nbr;
    }
}
