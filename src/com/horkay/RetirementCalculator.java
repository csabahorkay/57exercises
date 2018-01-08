package com.horkay;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class RetirementCalculator
{

    public static void retirementCalculator()
    {

//        What is your current age? 25 0 -25 150
//        At what age would you like to retire? 65 0 -65 150
//        You have 40 years left until you can retire.
//        It's 2015, so you can retire in 2055.
        while(true)
        {

            Scanner s = new Scanner(System.in);

            System.out.println("What is your current age?");

            int ageCurrent = s.nextInt();

            while (ageCurrent < 20 || ageCurrent > 100)
            {
                System.out.println("Enter valid age!");
                ageCurrent = s.nextInt();
            }

            System.out.println("At what age would you like to retire?");

            int ageRetire = s.nextInt();

            while (ageRetire < 50 || ageRetire > 100)
            {
                System.out.println("Enter valid age!");
                ageRetire = s.nextInt();
            }

            int yearsUntilRetirement = ageRetire - ageCurrent;

            System.out.println("You have " + yearsUntilRetirement + " years left until you can retire.");

            int year = YearMonth.now().getYear();
            int yearOfRetirement = year + yearsUntilRetirement;

            System.out.println("It's " + year + ", so you can retire in " + yearOfRetirement + ".");

        }

    }

}
