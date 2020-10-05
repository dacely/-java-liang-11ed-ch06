package com;

import java.util.Scanner;

public class E17_DisplayMatrix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n)
    {
        int x = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                x = (int) (Math.random() * 2);
                System.out.printf("%3d", x);
            }

            System.out.println();
        }
    }
}
