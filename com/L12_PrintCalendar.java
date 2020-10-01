package com;

import java.util.Scanner;

public class L12_PrintCalendar
{
    // test
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el año (ej. 2012): ");
        int year = input.nextInt();

        System.out.print("Ingrese el mes (1 - 12): ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    private static void printMonth(int year, int month)
    {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    private static void printMonthTitle(int year, int month)
    {
        System.out.println("\n\n");
        System.out.println("-----------------------------");

        String str1 = String.format("%s de %s", getMonthName(month), year);
        int n = (29 - str1.length()) / 2;

        for (int i = 0; i < n; ++i)
            System.out.print(" ");

        System.out.println(str1);
        System.out.println("-----------------------------");
        System.out.print(" Dom Lun Mar Mie Jue Vie Sab");
    }

    private static String getMonthName(int month)
    {
        String monthName;
        switch (month)
        {
            case 1:
                monthName = "Enero";
                break;
            case 2:
                monthName = "Febrero";
                break;
            case 3:
                monthName = "Marzo";
                break;
            case 4:
                monthName = "Abril";
                break;
            case 5:
                monthName = "Mayo";
                break;
            case 6:
                monthName = "Junio";
                break;
            case 7:
                monthName = "Julio";
                break;
            case 8:
                monthName = "Agosto";
                break;
            case 9:
                monthName = "Septiembre";
                break;
            case 10:
                monthName = "Octubre";
                break;
            case 11:
                monthName = "Noviembre";
                break;
            case 12:
                monthName = "Diciembre";
                break;
            default:
                monthName = "Error";
                break;
        }

        return monthName;
    }

    private static void printMonthBody(int year, int month)
    {
        int startDay = getStartDay(year, month);
        int numDays = daysInMonth(year, month);

        for (int i = 0; i < numDays + startDay; i++)
        {
            if (i % 7 == 0)
                System.out.println();

            if (i < startDay)
                System.out.print("    ");
            else
                System.out.printf("%4d", i + 1 - startDay);
        }

        System.out.println("\n");
    }

    private static int getStartDay(int year, int month)
    {
        // Elapsed days since jan 1, 1800
        int totalDays = 0;

        for (int i = 1800; i < year; i++)
        {
            if (isLeapYear(i))
                totalDays += 366;
            else
                totalDays += 365;
        }

        for (int i = 1; i < month; i++)
            totalDays += daysInMonth(year, i);

        return (totalDays + 3) % 7;
    }

    private static int daysInMonth(int y, int m)
    {
        int days;

        switch (m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = isLeapYear(y) ? 29 : 28;
                break;
            default:
                days = 30;
                break;
        }

        return days;
    }

    private static boolean isLeapYear(int y)
    {
        return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
    }
}
