package org.example;

public class PaintExample {
    public static void main(String[] args) {
        double x = 0.0;
        double y = 0.0;
        double r = 2.0;
        Main.Drawable f1 = new Main.Circle(r, x, y);
        f1.draw(Main.Color.RED);
        double a = 4.0;
        double b = 0.0;
        double a1 = 0.0;
        double b1 = 5.0;
        Main.Drawable f2 = new Main.Rectangle(a, b, a1, b1, x, y);
        f2.draw(Main.Color.RED);
        Main.Drawable f3 = new Main.Triangle(a, b, a1, b1, x, y);
        f3.draw(Main.Color.RED);
        a1 = 0.0;
        b1 = 4.0;
        Main.Drawable f4 = new Main.Square(a, b, a1, b1, x, y);
        f4.draw(Main.Color.RED);
    }
}