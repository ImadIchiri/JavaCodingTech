package org.example;

public abstract class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne() {}

    public Personne(Personne personne) {
        this.nom = personne.nom;
        this.prenom = personne.prenom;
        this.age = personne.age;
    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int dateDeNaissance() {
        return 2023 - this.age;
    }

    public String afficher() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age;
    }

    public abstract void method1();
}
