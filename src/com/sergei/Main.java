package com.sergei;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        float first, second;
        String action;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        first = in.nextFloat();
        System.out.println("Введите второе число");
        second = in.nextFloat();
        System.out.println("Введите действие");
        in.nextLine();
        action = in.nextLine();
        switch (action)
        {
            case "+":
                System.out.println(first + second);
                break;

            case "-":
                System.out.println(first - second);
                break;

            case "*":
                System.out.println(first * second);
                break;

            case "/":
                System.out.println(first / second);
                break;


        }










    }
}



