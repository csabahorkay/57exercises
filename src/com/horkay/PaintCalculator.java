package com.horkay;

import java.util.Scanner;

public class PaintCalculator
{

    public static void paintCalculator()
    {
//        Calculate gallons of paint needed to paint the ceiling of a room.

//        Prompt for the length and width,
// and assume one gallon covers 350 square feet.
//        Display the number of gallons needed to paint the ceiling as a whole number.

//        You will need to purchase 2 gallons of paint to cover 360 square feet.

//        szélesség és hosszuság változok mint inputok
//            lábban kérjük be az adatot
//            kiszámoljuk menniy a négyzetláb
//
//            contans hogy meniy négyzetláb gallononként
//
//            kiszámoljuk a megadott területhez menniy gallon kell elosztjuk őket
//
//            felkerek0tjük
//
//            output ként megjelenitjuk hány gallont kell venni


        Scanner input = new Scanner(System.in);





        final double FEET_TO_GALLON = 350;
        int areaFeet = 0;

while(true)
{
    System.out.println("What is the shape of the room, square(s), or circle(c)?");
    String shape = input.next();

    if (shape.equals("s"))
    {
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();

//        int length = 70;
//
//        int width = 6;

        areaFeet = length * width;
//        System.out.println(areaFeet);
//        break;
    }
    else if (shape.equals("c"))
    {
        System.out.println("What is the diameter of the room in feet?");
        int diameter = input.nextInt();

        areaFeet = (int)(diameter * diameter * Math.PI);
//        break;
    }
    else
    {
        System.out.println("Please give a valid input (s/c)!");
    }

        double gallonNeeded = areaFeet / FEET_TO_GALLON;
        int roundedGallonNeeded = (int) Math.ceil(gallonNeeded);

        System.out.println("You will need to purchase " + roundedGallonNeeded + " gallons of paint to cover " + areaFeet + " square feet.");
}

    }
}
