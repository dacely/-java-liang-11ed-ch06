package com;

public class E29_TwinPrimes
{
    public static void main(String[] args)
    {
        int counter = 0;
        long i = 0;
        while (counter < 1200)
        {
            if (isPrime(i) && isPrime(i + 2))
            {
                System.out.printf("(%d, %d)\n", i, i + 2);
                ++counter;
            }

            ++i;
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
