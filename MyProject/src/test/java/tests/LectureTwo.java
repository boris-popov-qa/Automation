package tests;

import org.testng.annotations.Test;

import java.util.Random;

public class LectureTwo {




    @Test
    public void test1(){

        Random rn = new Random();

        int firstValue = rn.nextInt(30);
        int secondValue = rn.nextInt(30);

        System.out.println("First number: " + firstValue);
        System.out.println("Second number: " + secondValue);

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

    @Test
    public void test2(){
        Random rn = new Random();
        int a = rn.nextInt(10);
        int b = rn.nextInt(10);

        //"Намерете начин да валидирате входните данни" - Не съм сигурен каква валидация се изисква точно, за тази точка от задачата.

        //If the number is between 1 and 5 - multiply by 10.
        if (a > 0 && a < 6){
            System.out.println("The result of " + a + " * 10 is: " + (a * 10));
        }

        if (b > 0 && b < 6){
            System.out.println("The result of " + b + " * 10 is: " + (b * 10));
        }

        //If the number is between 5 and 9 - multiply by 100.
        if (a > 5 && a < 10){
            System.out.println("The result of " + a + " * 100 is: " + (a * 100));
        }

        if (b > 5 && b < 10){
            System.out.println("The result of " + b + " * 100 is: " + (b * 100));
        }

        //Validating if the number is Prime or Not. (I had to use a little help from Google for this one)
        int remainder;
        boolean isPrime=true;

        //Validate a
        for(int i=2;i<=a/2;i++){
            remainder=a%i;

            if(remainder==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime && a > 1)
            System.out.println(a + " is a Prime number.");
        else
            System.out.println(a + " is not a Prime number.");

        //Validate b
        for(int i=2;i<=b/2;i++){
            remainder=b%i;

            if(remainder==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime && b > 1)
            System.out.println(b + " is a Prime number.");
        else
            System.out.println(b + " is not a Prime number.");
    }

    @Test
    public void test3(){
        Random rn = new Random();
        int newNumber = rn.nextInt(10);
        String numberName;

        switch (newNumber){
            case 0:
                numberName = "Zero";
                break;
            case 1:
                numberName = "One";
                break;
            case 2:
                numberName = "Two";
                break;
            case 3:
                numberName = "Three";
                break;
            case 4:
                numberName = "Four";
                break;
            case 5:
                numberName = "Five";
                break;
            case 6:
                numberName = "Six";
                break;
            case 7:
                numberName = "Seven";
                break;
            case 8:
                numberName = "Eight";
                break;
            case 9:
                numberName = "Nine";
                break;
            default:
                numberName = "Invalid number";
                break;

        }

        System.out.println(newNumber + " : " + numberName);


    }



    }

