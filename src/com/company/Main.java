package com.company;

import java.util.Scanner;

import static com.company.Fraction.mult;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 4);
        Fraction f2 = new Fraction(7, 4);
        Fraction f3 = mult(f1, f2);
        System.out.println("Умножение дробей : " + f3.toString());
        System.out.println(new Fraction(5,3));
    }
}