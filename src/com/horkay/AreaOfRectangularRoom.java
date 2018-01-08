package com.horkay;

import java.util.Scanner;

public class AreaOfRectangularRoom
{


    public static void inputQuestion(String FeetOrMeter)
    {
        System.out.println("What is the length of the room in " + FeetOrMeter + " ?");

    }

    public static void areaOfRectangularRoom() {

//        What is the length of the room in feet? 15
//        What is the width of the room in feet? 20
//        You entered dimensions of 15 feet by 20 feet.
//

// The area is
//        300 square feet
//        27.871 square meters
//
// The formula for this conversion is
//        m2 = f2 × 0.09290304


//        System.out.println();
//        System.out.println();
//        System.out.println();


//        int answer;
//        while (true) {
        Scanner input = new Scanner(System.in);
        double areaMeter;

        System.out.println("feet or meters?");
        String FeetOrMeters = input.nextLine();


        if (FeetOrMeters.equals("feet"))
        {
//            System.out.println("What is the length of the room in feet?");
            inputQuestion(FeetOrMeters);
            int length = input.nextInt();

//            System.out.println("What is the width of the room in feet?");
            inputQuestion(FeetOrMeters);
            int width = input.nextInt();

// if (!input.hasNextInt()) {
//                System.out.println("Please give valid number!");
//            }
//            else {
//                answer = input.nextInt();
//            }
//        }

            int areaFeet = length * width;
//            System.out.println(areaFeet);

            final double FEET_TO_METERS = 0.09290304;
            areaMeter = areaFeet * FEET_TO_METERS;
        } else
        {
//            System.out.println("What is the length of the room in meter?");
            inputQuestion(FeetOrMeters);
            int length = input.nextInt();

//            System.out.println("What is the width of the room in meter?");
            inputQuestion(FeetOrMeters);
            int width = input.nextInt();

            areaMeter = length * width;
        }

        System.out.println("The area of the room is: " + areaMeter + " square meters");

//        változokat dedininálni
//
//                ujabb változo a kettő szorzata
//
//                ujabb változo a négyzetméter ami az előző szorozva az együtthatóval


    }
}