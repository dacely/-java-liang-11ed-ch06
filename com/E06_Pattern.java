package com;

import java.util.Scanner;

public class E06_Pattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int n = input.nextInt();
        displayPattern(n);
    }

    private static void displayPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%3d", j);
            }

            System.out.println();
        }
    }
}
