package org.example.Task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Введите название книги");
        book.setTitle(in.nextLine());
        System.out.println("Введите имя автора");
        Book.Author author = new Book.Author();
        author.setName(in.nextLine());
        System.out.println("Введите пол автора");
        author.setGender(in.nextLine());
        System.out.println("Введите email автора");
        author.setEmail(in.nextLine());
        book.setAuthor(author);
        System.out.println("Введите год издания книги");
        book.setYear(in.nextInt());

        //работа метода toString1
        System.out.println("Метод toString");
        book.toString(true);
    }
}
