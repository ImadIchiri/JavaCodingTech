package org.example;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double calculerX = point.getX() - this.x;
        double calculerY = point.getY() - this.y;

        // On remplace (x ** 0.5) par Math.sqrt(x)
        // la racine de 5 ==> 5 ** 1/2
        return Math.sqrt(
               (
                       Math.pow(calculerX, 2)
                       + Math.pow(calculerY, 2)
               )
        );
    }

    public void translate(double dx, double dy) {
        setX(this.x + dx);
        setY(this.y + dy);
    }

    public void afficher() {
        System.out.println(
                "(x: " + this.x
                + ", y: " + this.y
                + ")"
        );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

/*
    CODE POUR LA CLASS MAIN:

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        p1.afficher();
        p2.afficher();

        System.out.println("La distance entre P1 et P2 est: " + p1.distance(p2));
        p1.translate(1, -2);

        p1.afficher();
*/