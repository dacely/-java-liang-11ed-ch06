package com;

import java.util.Scanner;

public class E02_SumDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        long num = input.nextLong();
        System.out.printf("La suma de los digitos es: %d", sumDigits(num));
    }

    private static int sumDigits(long n)
    {
        int sum = 0;

        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
