package com;

import java.util.Scanner;

public class E18_CheckPassword
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        if (isValidPassword(pass))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    private static boolean isValidPassword(String p)
    {
        if (p.length() < 10)
            return false;

        for (int i = 0; i < p.length(); i++)
        {
            char c = p.charAt(i);

            if (!Character.isLetterOrDigit(c))
                return false;
        }

        int countDigits = 0;
        for (int i = 0; i < p.length(); i++)
        {
            char c = p.charAt(i);
            if (Character.isDigit(c))
                ++countDigits;
        }

        if (countDigits < 3)
            return false;

        return true;
    }
}
