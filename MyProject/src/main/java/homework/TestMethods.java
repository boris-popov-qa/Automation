package homework;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class TestMethods {


    //Method for HomeworkFive - Test1
    public static void smallestNumber(int a, int b, int c){

        if(a<b && a<c){
            System.out.println("The smallest number is a: " + a);
        }
        else if(b<c){
            System.out.println("The smallest number is b: " + b);
        }
        else{
            System.out.println("The smallest number is c: " + c);
        }

    }

    //Method for HomeworkFive - Test2
    public static void testTwoMethod(String newString){

        List<String> listToPrint = asList(newString.split(" "));

        System.out.println(listToPrint.get(1) + " " + listToPrint.get(3) + " " + listToPrint.get(5));

    }

    //Method1 for HomeworkFive - Test3
        public static List<String> testThreeMethodOne(String newString){
            return Arrays.asList(newString.split(" "));

    }
    //Method2 for HomeworkFive - Test3
    public static int testThreeMethodTwo(List<String> listOfStrings){
        return listOfStrings.size();

    }

    //Method for HomeworkFive - Test4

    public static void interestCalc(int inv, double rate, int years){

        double finalInterest = inv + (inv * (rate / 100));
        int i = 1;
        do {
            System.out.println(finalInterest);
            finalInterest = finalInterest + (inv * (rate / 100));
            i++;
        } while (i < years);

        System.out.println("The total interest for 10 years is: " + finalInterest);

    }

    //Method for HomeworkFive - Test5
    public static void leapYear(int year){

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println("The year " + year + " is a leap year");
        }
        else {
            System.out.println("The year " + year + " is NOT a leap year");
        }
    }

    //Method for HomeworkFive - Test7
    public static void monthMethod(int month){
        switch (month) {
            case 1:
                System.out.println("The month you entered is January.");
                break;
            case 2:
                System.out.println("The month you entered is February.");
                break;
            case 3:
                System.out.println("The month you entered is March.");
                break;
            case 4:
                System.out.println("The month you entered is April.");
                break;
            case 5:
                System.out.println("The month you entered is May.");
                break;
            case 6:
                System.out.println("The month you entered is June.");
                break;
            case 7:
                System.out.println("The month you entered is July.");
                break;
            case 8:
                System.out.println("The month you entered is August.");
                break;
            case 9:
                System.out.println("The month you entered is September.");
                break;
            case 10:
                System.out.println("The month you entered is October.");
                break;
            case 11:
                System.out.println("The month you entered is November.");
                break;
            case 12:
                System.out.println("The month you entered is December.");
                break;
            default:
                System.out.println("Please enter a valid month!");
                break;
        }
    }


}
