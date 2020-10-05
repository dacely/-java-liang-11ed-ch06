package com;

import java.util.Scanner;

public class E03_ReverseAndPalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Ingrese un entero positivo: ");
        long num = input.nextLong();
        if (isPalindrome(num))
            System.out.print("El numero ingresado ES un palindrome");
        else
            System.out.print("El numero ingresado NO es un palindrome");
    }

    public static long reverse(long num)
    {
        long revNum = 0;

        while (num > 0)
        {
            if (revNum != 0)
                revNum *= 10;

            revNum += num % 10;
            num /= 10;
        }

        return revNum;
    }

    public static boolean isPalindrome(long num)
    {
        return num == reverse(num);
    }
}
