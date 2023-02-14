// importing classes
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*
        Write a program that asks the user for the lengths of the sides of a rectangle.
        Again, check for valid input and exit with an error msg if you don’t get it.

        Then print
        1  The area and perimeter of the rectangle
        2  The length of the diagonal (use the Pythagorean theorem)

        Testing: use some known values to confirm that the calculations are correct.
        E.g. 3 – 4 - 5 triangle >> 3 X 4 rectangle

        tests:
        1. both pos
        2. side A neg
        3. side B neg
        4. side A non-int
        5. side B non-int

         */

        // input variables:
        int rectSideA = 0;
        int rectSideB = 0;
        String trash = ""; // for bad input

        // for calculations later:
        int rectArea;
        int rectPerimeter;
        double diagonal;

        // initializing scanner:
        Scanner in = new Scanner(System.in);



        // start side A input
        System.out.println("Enter side A (whole numbers only, no decimals):");

        // check if input is an int
        if (in.hasNextInt()) {
            rectSideA = in.nextInt(); // store int
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
                System.out.println(rectSideA + " corrected to -" + rectSideA + ".");
                rectSideA *= -1;
            }
        }
        // end side A input

        // start side B input

        // check if input is an int
        if (in.hasNextInt()) {
            rectSideB = in.nextInt(); // store int
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
                System.out.println(rectSideB + " corrected to -" + rectSideB + ".");
                rectSideB *= -1;
            }
        }
        // end side B input


        //calculations:
        rectArea = rectSideA * rectSideB;
        rectPerimeter = 2 * (rectSideA + rectSideB);
        diagonal = Math.sqrt((rectSideA ^ 2) + (rectSideB ^ 2));

        // final output:
        System.out.println("Area: " + rectArea + "\n" +
                "Perimeter: " + rectPerimeter + "\n" +
                "Length of diagonal: " + diagonal);

        // end


        // WRITE MESSAGE TO ANDREW HERE

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
//
//
    }
}