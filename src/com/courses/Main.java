package com.courses;
import java.util.Scanner;
import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String chose;
        System.out.println("Какое уравнение вы хотите посчитать?\nA)F(x)= x - sin x;\nB) F(x) = sin^2 x;\nC) F (x) = 2cos x - 1");
        System.out.println("Введите выбранную формулу заглавными латинскими буквам !");
        chose = in.next();
        double a, b;
	double h;
	double answ;
        System.out.print("Введите границы исчесления от А: ");
        a = in.nextDouble();
        System.out.println(" и до Б: ");
        b = in.nextDouble();
        System.out.println("А так-же введите шаг изменения С: ");
        h = in.nextDouble();
        for ( double i = a; i < b; i += h){
            switch (chose)
            {
                case "A":
                {
                    answ =  i - sin(i);
                    System.out.println("F("+i+") = " + answ);
                    break;
                }
                case "B":
                {
                    answ = sin(i) * sin(i);
                    System.out.println("F("+i+") = " + answ);
                    break;
                }
                case  "C":
                {
                    answ = 2 * cos(i) - i;
                    System.out.println("F("+i+") = " + answ);
                    break;
                }
            }
        }
    }
}
