package com.horkay;

import java.util.Scanner;

public class PizzaParty2
{

    public static void pizzaParty2()
    {


//        Create a variant of the program that

//        prompts for
//          the number of people
//          and the number of pieces

//
//        2 ember
//        8 szelet egy pizza
//
//        8 szeletet akar mindegyik akkor
//        16 szelet kell összesen
//
//        16 / 8  számú pizza kell öszes szeletet elosztani az egy pizzára jutó szeletekkel
//            ha tört szám az eredmény akkor kerekiteni

//        2 az eredmény



        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");

        int peopleNumber = input.nextInt();

//        int peopleNumber = 1;

        System.out.println("How many pizza piece(s) per person?");

        int pizzaPiecesPerPerson = input.nextInt();

//        int pizzaPiecesPerPerson = 9;

        final double PIZZA_PIECES_PER_PIZZA = 8;

        int pizzaPiecesAll = peopleNumber * pizzaPiecesPerPerson;

        System.out.println("Number of slices altogether: " + pizzaPiecesAll);

        double numberOfPizzasWanted = pizzaPiecesAll / PIZZA_PIECES_PER_PIZZA;

        int roundedPizzasWanted = (int) Math.ceil(numberOfPizzasWanted);

        System.out.println("1 pizza has 8 slices, therefore, we need " + roundedPizzasWanted + " pizza(s).");


    }
}
