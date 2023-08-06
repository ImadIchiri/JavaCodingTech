package org.example;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        Personne p1 = new Etudiant("Ichiri", "Imad", 21, "AB12345");
        Personne p2 = new Etudiant("Saadi", "Wahib", 15, "AB12345");
        Personne p3 = new Etudiant("Malhi", "Ilham", 47, "AB12345");
        Personne p4 = new Etudiant("Lehlou", "Ahlam", 21, "AB12345");
        Personne p5 = new Etudiant("Ahmadi", "Mansor", 60, "AB12345");
        Personne p6 = new Etudiant("Jaafar", "Saad", 16, "AB12345");

        Personne p7 = new Etudiant("Elheyani", "Weeam", 21, "AB12345");

        List<Personne> personneList = new java.util.ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

        personneList.add(p7);
        personneList.remove(p1);

        Comparator<Personne> comparator =(Personne per1, Personne per2)->{
            return per1.getAge() - per2.getAge();
        };

        Collections.sort(personneList, comparator);

        System.out.println(personneList);

        personneList.removeIf(p -> p.getNom() != "Ichiri");

        System.out.println(personneList);
    }
}
