package com.horkay;

//import java.util.Scanner;
import java.util.*;

public class SimpleMath
{

    public static void simpleMath()
    {
//        What is the first number? 10
//        What is the second number? 5
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2



//    Scanner sc = new Scanner(System.in);
//        int number;
//        do {
//            System.out.println("Please enter a positive number!");
//            while (!sc.hasNextInt()) {
//                System.out.println("That's not a number!");
//                sc.next(); // this is important!
//            }
//            number = sc.nextInt();
//        } while (number <= 0);
//        System.out.println("Thank you! Got " + number);





//        String num1 = input.nextLine();
//        int num1 = Integer.parseInt(input.nextLine());


//        lehet string ként kéne benyelni hogy nel egyen exception aztűn átalakitani integerré és ott tesztelni az értéket

//        Scanner input = new Scanner(System.in);
//        int num1;
//
//        do
//        {
//            System.out.println("What is the first number? Please type in an integer!");
//
//            if input.hasNextInt()
//            num1 = input.nextInt();
//            else
//
//
//        } while (!input.hasNextInt());


//        kell egy prompt adjon meg integert
//            ellenőrizni jót vagy rosszat adott
//            ha rosszat adott ujra kérni loop
//            ha jot adott tovább megy a program
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Please enter an integer ");
//
//        do
//        {
//            try {
//                s.nextInt();
//            } catch(InputMismatchException e) {
//                System.out.println("Please enter an integer ");
//            }
//
//
//        }  while (true);

//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("What is the first number?");
//
//        int num1 = input.nextInt();
//
//        System.out.println("What is the second number?");
//
//        int num2 = input.nextInt();
//
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));




        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");

        String num1 = input.next();
        int num1_int = Integer.parseInt(num1);


        System.out.println("What is the second number?");

        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1_int + num2));

    }
}
