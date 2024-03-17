package org.example;

public class Main {

    public class Point {
        double x;
        double y;
    }

    public abstract static class Figure {
        Point point;

        Figure() {
        }

        public abstract void area();

        public abstract void perimeter();
    }

    public static enum Color {
        RED,
        YELLOW,
        GREEN,
        BLUE,
        BLACK;

        private Color() {
        }
    }

    public interface Drawable {
        void draw();

        void draw(Color var1);
    }

    static class Circle implements Drawable {
        double radius;
        double x;
        double y;

        Circle(double radius, double x, double y) {
            this.radius = radius;
            this.x = x;
            this.y = y;
        }

        public void draw() {
        }

        public void draw(Color color) {

           System.out.println("Нарисован круг цвета "+ color +" с началом в точке ("+x+","+y+ ") и радиусом "+radius);
        }

        public void area() {
        }

        public void perimeter() {
        }
    }


    static class Rectangle extends Figure implements Drawable {
        double a;
        double b;
        double a1;
        double b1;
        double x;
        double y;

        Rectangle(double a, double b, double a1, double b1, double x, double y) {
            this.a = a;
            this.b = b;
            this.a1 = a1;
            this.b1 = b1;
            this.x = x;
            this.y = y;
        }

        public void draw() {
        }

        public void draw(Color color) {
            System.out.println("Нарисован прямоугольник цвета " + color + " задаваемый началом в точке (" + x + "," + y + ") и векторами (" + a + "," + b + ") и (" + a1 + "," + b1 + ")");
        }

        public void area() {
        }

        public void perimeter() {
        }
    }

    static class Triangle extends Figure implements Drawable {
        double a;
        double b;
        double a1;
        double b1;
        double x;
        double y;

        Triangle(double a, double b, double a1, double b1, double x, double y) {
            this.a = a;
            this.b = b;
            this.a1 = a1;
            this.b1 = b1;
            this.x = x;
            this.y = y;
        }

        public void draw() {
        }

        public void draw(Color color) {
            System.out.println("Нарисован треугольник цвета " + color + " задаваемый началом в точке (" + x + "," + y + ") и векторами (" + a + "," + b + ") и (" + a1 + "," + b1 + ")");
        }

        public void area() {
        }

        public void perimeter() {
        }
    }

    static class Square extends Rectangle implements Drawable {
        Square(double a, double b, double a1, double b1, double x, double y) {
            super(a, b, a1, b1, x, y);
        }

        public void draw() {
        }

        public void draw(Color color) {

            System.out.println("Нарисован квадрат цвета " + color + " задаваемый началом в точке (" + x + "," + y + ") и вектором (" + a + "," + b + ") и векторами (" + a + "," + b + ") и (" + a1 + "," + b1 + ")");
        }

        public void area() {
        }

        public void perimeter() {
        }
    }

    public class FigureUtil {
        private FigureUtil(final Main this$0) {
        }

        public static void area(Figure figure) {
        }

        public static void perimeter(Figure figure) {
        }

        public static void draw(Drawable figure) {
        }

        public static void draw(Drawable figure, Color color) {
        }
    }


}