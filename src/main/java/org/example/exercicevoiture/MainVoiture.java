package org.example.exercicevoiture;

public class MainVoiture {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Audi");
        Voiture v2 = new Voiture("BMW");
        Voiture v3 = new Voiture("Mercedes");
        Voiture v4 = new Voiture("Alfa Romeo");
        Voiture v5 = new Voiture("Ferrari");

        System.out.println(Voiture.getNombreDesVoitures());
    }
}
