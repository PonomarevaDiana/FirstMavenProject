package org.example.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        double radius = in.nextDouble();
        in.nextLine();
        System.out.println("Введите цвет круга");
        String color = in.nextLine();
        Circle c =new Circle(radius,color);

        //работа метода area
        System.out.println("Метод area");
        System.out.println(c.area());
        System.out.println();

        //работа метода perimeter
        System.out.println("Метод perimeter");
        System.out.println(c.perimeter());
        System.out.println();

        //работа метода toString
        System.out.println("Метод toString");
        c.toString();
        System.out.println();
    }
}

