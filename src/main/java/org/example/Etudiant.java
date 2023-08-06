package org.example;

public class Etudiant extends Personne {
    private String cne;
    public Etudiant(String nom, String prenom, int age, String cne ) {
        super(nom, prenom, age);
        this.cne = cne;
    }

    public Etudiant(String nom, String prenom, int age ) {
        super(nom, prenom, age);
        this.cne = cne;
    }

    public String getCne() {
        return this.cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public String afficher() {
        System.out.println(super.afficher());
        return "CNE='" + cne + "'";
    }

    @Override
    public String toString() {
        return super.toString() + ", cne=" + cne;
    }

    public void method1(){

    }


}
