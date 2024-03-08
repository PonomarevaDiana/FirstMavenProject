package org.example.Task3;
import java.util.Scanner;
import java.lang.Math;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер матрицы");
        int m = in.nextInt();
        double[][] t = new double[m][m];
        double[][] t1 = new double[m][m];
        double[][] t2 = new double[m][m];
        Matrix a = new Matrix(t, m, m);
        Matrix c = new Matrix(t2, m, m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                a.setValue(i, j, Math.random() * 10);
            }
        }
        for (int i = 0; i < m; i++) {
            c.t[i] = a.t[i].clone();
        }

        Matrix b = new Matrix(t1, m, m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                b.setValue(i, j, Math.random() * 5);
            }
        }

        //метод вывода матрицы
        System.out.println("Вывод матрицы a");
        a.outWrite();
        System.out.println();

        System.out.println("Вывод матрицы b");
        b.outWrite();
        System.out.println();

        //метод сложения матриц
        System.out.println("Результат сложения матриц a и b");
        a.addition(b);
        a.outWrite();
        System.out.println();

        for (int i = 0; i < m; i++) {
            a.t[i] = c.t[i].clone();
        }

        //метод умножения матриц
        System.out.println("Результат умножения матриц a и b");
        a.multiplication(b);
        a.outWrite();
        System.out.println();

        for (int i = 0; i < m; i++) {
            a.t[i] = c.t[i].clone();
        }
        //метод умножения матрицы на число
        System.out.print("Введите число, на которое хотите умножить матрицу a");
        System.out.println();
        double k = in.nextDouble();
        a.multiplicationCoef(k);
        System.out.println("Матрица a, умноженная на число k");
        a.outWrite();
    }
}

