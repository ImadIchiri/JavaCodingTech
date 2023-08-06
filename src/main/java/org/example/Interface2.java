package org.example;

public interface Interface2 {
    void method3();
    void somme(int n1, int n2);
    public default void afficher() {
        System.out.println("DEFAULT METHOD 2 !");
    }
}
