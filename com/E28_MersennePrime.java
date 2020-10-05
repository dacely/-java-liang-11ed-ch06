package com;

public class E28_MersennePrime
{
    public static void main(String[] args)
    {
        System.out.println(" p          2^p - 1");
        System.out.println("-------------------");
        for (int i = 1; i <= 31; i++)
        {
            long m = ((long) Math.pow(2, i)) - 1;
            if (isPrime(m))
                System.out.printf("%2d %16d\n", i, m);
        }
    }

    public static boolean isPrime(long n)
    {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n%2 == 0 || n%3 == 0) return false;

        long sqrtN = (long)Math.sqrt(n) + 1;

        for (long i = 6L; i <= sqrtN; i += 6)
        {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }

        return true;
    }
}
