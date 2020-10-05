package com;

import java.util.Scanner;

public class E14_EstimatePI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese canidad de terminos en la sumatoria para aproximar PI (multiplos de 100): ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("|   i   |    m(i)    |    error   |");
        System.out.println("-----------------------------------");

        double x = m(1);
        System.out.printf("|%7d|%12.6f|%12.6f|\n", 1, x, Math.PI - x);

        for (int i = 100; i <= n; i += 100)
        {
            x = m(i);
            System.out.printf("|%7d|%12.6f|%12.6f|\n", i, x, Math.PI - x);
        }

        System.out.println();
    }

    public static double m(int n)
    {
        double sum = 0;

        for (int i = 1; i <= n; i++)
        {
            double x = 1 / (2.0 * i - 1.0);

            if (i % 2 == 0)
                sum -= x;
            else
                sum += x;
        }

        return 4 * sum;
    }
}
