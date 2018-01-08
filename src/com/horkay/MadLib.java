package com.horkay;

import java.util.Scanner;

public class MadLib
{

    public static void madLib()
    {

//        Enter a noun: dog
//        Enter a verb: walk
//        Enter an adjective: blue
//        Enter an adverb: quickly
//        Do you walk your blue dog quickly? That's hilarious

        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter a noun:");
            String noun = input.nextLine();
            System.out.println("Enter a verb:");
            String verb = input.nextLine();
            System.out.println("Enter an adjective:");
            String adjective = input.nextLine();
            System.out.println("Enter an adverb:");
            String adverb = input.nextLine();

            System.out.println("Do you " + verb + " your "+ adjective + " " + noun + " " + adverb + "? That\'s hilarious.");

        }


    }
}
