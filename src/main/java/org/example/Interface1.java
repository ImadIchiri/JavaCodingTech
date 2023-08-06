package org.example;

public interface Interface1 {
    void method2();
    void somme(int n1, int n2);
    default void afficher() {
        System.out.println("DEFAULT METHOD 1 !");
    }

}
