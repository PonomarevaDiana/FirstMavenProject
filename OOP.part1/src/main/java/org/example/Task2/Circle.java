package org.example.Task2;
import java.lang.Math;
public class Circle {
    double radius;
    String color;
    public double area(){
        return(Math.PI*radius*radius);
    }
    public double perimeter(){
        return(2*Math.PI*radius);
    }
    public Circle (double radius, String color){
        this.color = color;
        this.radius = radius;
    }
    public String toString(){
        System.out.println("Радиус " + radius );
        System.out.println("Цвет "+ color);
        System.out.println("Площадь "+ area());
        System.out.println("Периметр "+ perimeter());
        return "";
    }
}
