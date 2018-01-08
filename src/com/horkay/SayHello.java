package com.horkay;

import java.util.Scanner;

public class SayHello
{
    public static void sayHello()
    {
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("What is your name?");

//            int name = input.nextInt();
            String name = input.nextLine();

            if (name.equals("Jon"))
            {
                System.out.println("Hello, " + name + ", nice to meet you again!");
            }
            else
            {
                System.out.println("Hello, " + name + ", nice to meet you!");
            }
        }
        while (true);
    }
}


