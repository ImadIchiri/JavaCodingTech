package org.example.exercicevehicule;

public class Voiture extends Vehicule {
    private int nombreCylindre;
    private int nombrePortes;
    private int puissance;
    private double kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, int nombreCylindre, int nombrePortes, int puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.nombreCylindre = nombreCylindre;
        this.nombrePortes = nombrePortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public int getNombreCylindre() {
        return nombreCylindre;
    }

    public void setNombreCylindre(int nombreCylindre) {
        this.nombreCylindre = nombreCylindre;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public double calculePrix(int anneActuelle) {
        double prixActuelle;

        // 2%
        prixActuelle = super.reductionParAnne(super.getPrixAchat(), anneActuelle, 2); // -2% chaque année

        // 5%
        double reductionParKilometrage = (kilometrage * 0.05) / 10_000;
        prixActuelle = prixActuelle - (prixActuelle * reductionParKilometrage);

        // 10%
        if (super.getMarque().equalsIgnoreCase("Renault") || super.getMarque().equalsIgnoreCase("Fiat")) {
            prixActuelle = prixActuelle - (prixActuelle * 0.1); // -10%
        }

        // 20%
        if (super.getMarque().equalsIgnoreCase("Ferrari") || super.getMarque().equalsIgnoreCase("Renault")) {
            prixActuelle = prixActuelle - (prixActuelle * 0.2); // -20%
        }

        if (prixActuelle < 0) {
            prixActuelle = 0;
        }

        super.setPrixCourant(prixActuelle);

        return prixActuelle;
    }


    @Override
    public String toString() {
        return super.toString()
                + ", Nombre de Cylindre: " + nombreCylindre
                + ", Nombre Portes: " + nombrePortes
                + ", puissance: " + puissance
                + ", kilometrage: " + kilometrage;
    }
}
