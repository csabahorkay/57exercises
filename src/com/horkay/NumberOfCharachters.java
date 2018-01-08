package com.horkay;

import java.util.Scanner;

public class NumberOfCharachters
{

    public static void numberOfCharachters()
    {


//        What is the input string?
//          Homer
//        Homer has 5 characters.

        do
        {
            System.out.println("What is the input string?");

            Scanner input = new Scanner(System.in);

            String answer = input.nextLine();

            if (answer.isEmpty())
            {
                System.out.println("Please give a valid input!");
            }
            else
            {
                System.out.println(answer + " has " + answer.length() + " characters.");
            }

        }
        while (true);
    }
}