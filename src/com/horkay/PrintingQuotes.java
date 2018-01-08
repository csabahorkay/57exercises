package com.horkay;


import java.util.Scanner;

public class PrintingQuotes
{

    public static void printingQuotes()
    {




//        What is the quote? These aren't the droids you're looking for.
//        Who said it? Obi-Wan Kenobi
//        Obi-Wan Kenobi says, "These aren't the droids
//        you're looking for."
//        do
        while(true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the quote?");
            String quote = input.nextLine();

            System.out.println("Who said it?");
            String author = input.nextLine();


            System.out.println(author + " says, " + quote + " .");
        }



    }
}
