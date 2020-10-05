package com;

public class E13_SumSeries
{
    public static void main(String[] args)
    {
        System.out.println("i            m(i)");
        System.out.println("-----------------");

        for (int i = 1; i <= 20; i++)
        {
            System.out.printf("%2d %14.4f", i, m(i));
            System.out.println();
        }
    }

    public static double m(int n)
    {
        double sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i / (i + 2.0);

        return  sum;
    }
}
