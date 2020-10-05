package com;

public class E27_EmpirNumbers
{
    public static void main(String[] args)
    {
        int counter = 0;
        long n = 1;
        while (counter < 120)
        {
            if (isPrime(n) && isPrime(reverse(n)))
            {
                if (!isPalindrome(String.valueOf(n)))
                {
                    System.out.printf("  %d", n);
                    ++counter;

                    if (counter % 10 == 0)
                        System.out.println();
                }
            }
            ++n;
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

    public static boolean isPalindrome(String str)
    {
        int n = str.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i <= n - i; i++)
        {
            if (str.charAt(i) != str.charAt(n - i))
            {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
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
}
