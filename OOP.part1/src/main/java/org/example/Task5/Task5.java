package org.example.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PizzaOrder pizza = new PizzaOrder();
        System.out.println("Введите название пиццы");
        pizza.setTitle(in.nextLine());
        System.out.println("Введите размер пиццы: большая, средняя или маленькая");
        String s = in.nextLine();
        if (s == "большая") pizza.size.BIG.setBIG(true);
        else if (s == "средняя") pizza.size.MEDIUM.setBIG(true);
        else if (s == "маленькая") pizza.size.SMALL.setBIG(true);

        System.out.println("Нужен ли соус? Напишите true или false");
        pizza.setIsSauce(in.nextBoolean());
        in.nextLine();
        System.out.println("По какому адресу вы хотите забрать пиццу?");
        pizza.setAddress(in.nextLine());
        //метод cancel(заказ еще не сделан)
        pizza.cancel();
        //метод order(заказываем)
        pizza.order();
        //метод cnacel(заказ сделан)
        pizza.cancel();
        //попытка второй раз заказать
        pizza.order();
        //отмечняем заказ
        pizza.toString();
        pizza.cancel();
    }
}
