package org.example;

public class InterfacesTest implements Interface1, Interface2 {
    @Override
    public void method2() {};
    @Override
    public void method3() {};
    @Override
    public void somme(int n1, int n2) {}

    @Override
    public void afficher() {
        Interface1.super.afficher();
    }


}
