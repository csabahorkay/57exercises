package com.horkay;

import java.util.Scanner;

public class PizzaParty {

    public static void pizzaParty()
    {

//
////        How many people? 8
//
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("How many people?");
//
//            int peopleNumber = input.nextInt();
//
////        int people = 9;
//        System.out.println(peopleNumber);
//
//        System.out.println("How many pizzas do you have?");
//ß
//            int pizzaNumber = input.nextInt();
////        How many pizzas do you have? 2
////        int pizzaNumber = 2;
//        System.out.println(pizzaNumber);
//
////        8 people with 2 pizzas
//        System.out.println(peopleNumber + " people with " + pizzaNumber + " pizzas");
//
//            final int PIZZA_PIECES_PER_PIZZA = 8;
////        int pizzaPiecesPerPizza = 8;
//
//                int pizzaPiecesAll = pizzaNumber * PIZZA_PIECES_PER_PIZZA;
//
//
////        Each person gets 2 pieces of pizza.
//
//            int pizzaPerPerson = pizzaPiecesAll / peopleNumber;
//
//        System.out.println("Each person gets " + pizzaPerPerson + " pieces of pizza.");
//
//
////        There are 0 leftover pieces.
//
//                int leftoverPizzaPieces = pizzaPiecesAll % peopleNumber;
//
//        System.out.println("There are " + leftoverPizzaPieces + " leftover pieces.");
//

//        INPUT

        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");

            int peopleNumber = input.nextInt();

        System.out.println("How many pizzas do you have?");

            int pizzaNumber = input.nextInt();



        System.out.println(peopleNumber + " people with " + pizzaNumber + " pizza(s)");

            final int PIZZA_PIECES_PER_PIZZA = 8;

//      PROCESSING

                int pizzaPiecesAll = pizzaNumber * PIZZA_PIECES_PER_PIZZA;

                int pizzaPerPerson = pizzaPiecesAll / peopleNumber;

//       OUTPUT

        System.out.println("Each person gets " + pizzaPerPerson + " piece(s) of pizza.");

                int leftoverPizzaPieces = pizzaPiecesAll % peopleNumber;

        System.out.println("There are " + leftoverPizzaPieces + " leftover piece(s).");



    }
}
