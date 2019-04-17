package tests;

import org.testng.annotations.Test;

public class LectureTwo {

    int firstValue = 24;
    int secondValue = 13;


    @Test
    public void test1(){
        firstValue = firstValue % 2;
        secondValue = secondValue % 2;

        //Check if first number is even or odd.
        if (firstValue == 0) {
            System.out.println("The first number is an Even number.");
        }
        else
            System.out.println("The first number is an Odd number.");

        //Check if second number is even or odd.
        if (secondValue == 0) {
            System.out.println("The second number is an Even number.");
        }
        else
            System.out.println("The second number is an Odd number.");


        //Check if both numbers are even.
        if (firstValue == 0 && secondValue == 0) {
            System.out.println("Both numbers are Even numbers.");
        }
        else
            System.out.println("The two numbers are NOT both even.");

        //Check if both numbers are odd.
        if (firstValue != 0 && secondValue != 0) {
            System.out.println("Both numbers are Odd numbers.");
        }
        else
            System.out.println("The two numbers are NOT both odd.");
    }
}
