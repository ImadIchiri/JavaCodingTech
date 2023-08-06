package org.example.exercicevehicule;

public class Avion extends Vehicule {
    private String typeMoteur; //HELICES ou Autre
    private double nombreHeuresDeVol;

    public Avion(String marque, int dateAchat, double prixAchat, String typeMoteur, double nombreHeuresDeVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.nombreHeuresDeVol = nombreHeuresDeVol;
    }

    public String getTypeMoteur() {
        return typeMoteur;
    }

    public void setTypeMoteur(String typeMoteur) {
        this.typeMoteur = typeMoteur;
    }

    public double getNombreHeuresDeVol() {
        return nombreHeuresDeVol;
    }

    public void setNombreHeuresDeVol(double nombreHeuresDeVol) {
        this.nombreHeuresDeVol = nombreHeuresDeVol;
    }

    @Override
    public double calculePrix(int anneActuelle) {
        double prixActuelle;
        double coutDeReduction;

        // -10%
        if (this.typeMoteur.equalsIgnoreCase("HELICES")) {
            coutDeReduction = (nombreHeuresDeVol * 0.1) / 100; // -10% pour chaque 100 Heures
        } else {
            coutDeReduction = (nombreHeuresDeVol * 0.1) / 1_000; // -10% pour chaque 1_000 Heures
        }

        prixActuelle = super.getPrixAchat() - (super.getPrixAchat() * coutDeReduction);

        if (prixActuelle < 0) {
            prixActuelle = 0;
        }

        super.setPrixCourant(prixActuelle);

        return prixActuelle;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type de moteur: " + typeMoteur
                + ", Nombre des heures de vol: " + nombreHeuresDeVol;
    }
}
