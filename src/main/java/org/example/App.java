package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the principal:");
        int principal = scnr.nextInt();

        System.out.println("Enter the rate of interest");
        double rateOfInterest = scnr.nextDouble();

        System.out.println("Enter the number of years");
        int years = scnr.nextInt();

        System.out.println("Enter the number of times the interest is compounded per year?");
        int yearsCompounded = scnr.nextInt();

        double A = principal * Math.pow(1 + ((rateOfInterest / 100) / yearsCompounded), yearsCompounded * years);

        System.out.format("$%d invested at %.1f%% for " + years + " years compounded " + yearsCompounded + " is $%.2f.", principal, rateOfInterest, A);


    }
}
        /*double A = principal * (1 + (rateOfInterest / 100) * years);
        System.out.format("After %d years at %.1f%%, the investment will be worth $%.2f.", years, rateOfInterest, A);
        */