package com;

import java.util.Scanner;

public class E19_SquareRoot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        long s = input.nextLong();
        System.out.printf("La raiz cuadrada de %d es %.5f", s, sqrt(s));
    }

    public static double sqrt(long s)
    {
        double error = 0.00001;
        double x = 1;

        while (Math.abs(s - x * x) > error)
        {
            x = (x + (s / x)) / 2.0;
        }

        return x;
    }
}
