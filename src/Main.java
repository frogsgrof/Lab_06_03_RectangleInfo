// importing classes
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // input variables:
        double rectSideA = 0;
        double rectSideB = 0;
        String trash = ""; // for bad input

        // for calculations later:
        double rectArea;
        double rectPerimeter;
        double diagonal;

        // initializing scanner:
        Scanner in = new Scanner(System.in);



        // start side A input
        System.out.println("Enter side A:");

        // check if input is an int
        if (in.hasNextDouble()) {
            rectSideA = in.nextDouble(); // store int
            in.nextLine(); // clear next line
        } else {
            trash = in.nextLine(); // if not, throw away
            System.out.println("ERROR: " + trash + " could not be interpreted as an integer.\n" +
                    "Please exit and try again."); // output error message
            System.exit(0); // terminate
        }

        // in case the int isn't positive
        if (rectSideA < 1){
            // print error
            System.out.println("ERROR: sides cannot be negative or zero.");

            if (rectSideA == 0){
                // if zero, just terminate
                System.out.println("Please exit and try again.");
                System.exit(0);
            } else {
                // if it's negative, just assume they meant positive but let them know
                System.out.println(rectSideA + " corrected to " + (rectSideA * -1) + ".");
                rectSideA *= -1;
            }
        }
        // end side A input


        // start side B input

        System.out.println("Enter side B: ");

        // check if input is an int
        if (in.hasNextDouble()) {
            rectSideB = in.nextDouble(); // store int
            in.nextLine(); // clear next line
        } else {
            trash = in.nextLine(); // if not, throw away
            System.out.println("ERROR: " + trash + " could not be interpreted as an integer.\n" +
                    "Please exit and try again."); // output error message
            System.exit(0); // terminate
        }

        // in case the int isn't positive
        if (rectSideB < 1){
            // print error
            System.out.println("ERROR: sides cannot be negative or zero.");

            if (rectSideB == 0){
                // if zero, just terminate
                System.out.println("Please exit and try again.");
                System.exit(0);
            } else {
                // if it's negative, just assume they meant positive but let them know
                System.out.println(rectSideB + " corrected to " + (rectSideB * -1) + ".");
                rectSideB *= -1;
            }
        }
        // end side B input



        //calculations:
        rectArea = rectSideA * rectSideB;
        rectPerimeter = 2 * (rectSideA + rectSideB);
        diagonal = Math.sqrt((rectSideA * rectSideA) + (rectSideB * rectSideB));

        // final output:
        System.out.println("Area: " + rectArea + "\n" +
                "Perimeter: " + rectPerimeter + "\n" +
                "Length of diagonal: " + diagonal);


        // end



        /*

        The commented code below this is the remains of my original attempt at this,
        using integers. I thought about emailing you to ask what's going on
        with it, but since I figured it out in the end and it wasn't urgent
        I decided to just include a message here at the end.

        When I ran the old code, I kept having this weird issue where after it asked
        for side A, it wouldn't proceed until I gave two inputs. I thought it
        was because of the way I checked for zero/negative numbers, so I reconfigured
        it the way you see above, but it still didn't work. Luckily changing them all
        to doubles fixed it. Why is that? I couldn't find any answers online.

         */

        // old code:

//        if (in.hasNextInt()){ // if input is a valid int
//
//            if (in.nextInt() == 0) { // first eliminate zeroes
//                trash = in.nextLine(); // throw out bad input
//                System.out.println("You entered: " + trash + "\n" +
//                        "Invalid input.");
//                System.exit(0); // terminate
//            } else { // if not zero, store it
//                rectSideA = in.nextInt();
//                in.nextLine(); // clear next line
//            }
//
//            if (rectSideA < 0) { // if negative, keep but make it positive
//                rectSideA *= -1;
//                System.out.println("The number you entered is negative. Continuing process with Side A = " + rectSideA + ".");
//            }
//
//        } else { // to handle non-integers
//            trash = in.nextLine(); // throw out bad input
//            System.out.println("You entered: " + trash + "\n" +
//                    "Invalid input.");
//            System.exit(0);
//        } // end side A input
//
//
    }
}