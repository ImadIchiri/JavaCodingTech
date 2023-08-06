package org.example.exercicevehicule;

public class Vehicule {
    private String marque;
    private int dateAchat; // annee
    private double prixAchat;
    private double prixCourant;

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(int dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    /**
     * @param prixAchat
     * @param anneActuelle
     * @param coutDeReduction
     * @return Le prix Actuelle
     */
    public double reductionParAnne(double prixAchat, int anneActuelle,double coutDeReduction) {
        double pourcentageDereduction = (anneActuelle - dateAchat) * coutDeReduction / 100;
        double prixActuelle = prixAchat - (prixAchat * pourcentageDereduction);

        if (prixActuelle < 0) {
            prixActuelle = 0;
        }

        setPrixCourant(prixAchat);

        return prixActuelle;
    }

    public double calculePrix(int anneActuelle) {
        return reductionParAnne(this.prixAchat, anneActuelle, 1);
    }

    @Override
    public String toString() {
        return "Marque: "
                + marque + ", Date d'achat: "
                + dateAchat + ", Prix d'achat: "
                + prixAchat + ", Prix courant: "
                + prixCourant;
    }

}

/*
    Exemple du code:

        // Les Prix Sont En Dhs

        Voiture voiture1 = new Voiture("Renault", 2016, 21_000, 4, 4, 75, 750_000);
        Voiture voiture2 = new Voiture("Fiat", 2008, 18_000, 4, 4, 92, 420_000);
        Voiture voiture3 = new Voiture("Porsche", 2020, 1_200_000, 8, 4, 275, 120_450);
        Voiture voiture4 = new Voiture("Seat", 2008, 18_000, 4, 4, 92, 420_000);

        System.out.println("Fiat: ");
        System.out.println(voiture1.calculePrix(2023));

        System.out.println("Seat: ");
        System.out.println(voiture1.calculePrix(2023));
*/
