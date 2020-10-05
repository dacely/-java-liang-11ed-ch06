package com;

public class E05_SortThreeIntegers
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            int num3 = (int) (Math.random() * 100);
            displaySortedIntegers(num1, num2, num3);
        }
    }

    private static void displaySortedIntegers(int a, int b, int c)
    {
        int temp;

        if (b > c)
        {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b)
        {
            temp = a;
            a = b;
            b = temp;

            if (b > c)
            {
                temp = b;
                b = c;
                c = temp;
            }
        }

        System.out.printf("%2d, %2d, %2d \n", a, b, c);
    }
}
