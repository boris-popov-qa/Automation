package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class TestMethods {


    private static List<String> listToPrint2;

    //Method for Test1
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

    //Method for Test2
    public static void testTwoMethod(String newString){

        List<String> listToPrint = asList(newString.split(" "));

        System.out.println(listToPrint.get(1) + " " + listToPrint.get(3) + " " + listToPrint.get(5));

    }

    //Method1 for Test3
        public static List<String> testThreeMethodOne(String newString){
            return Arrays.asList(newString.split(" "));

    }
    //Method2 for Test3
    public static int testThreeMethodTwo(List<String> listOfStrings){
        return listOfStrings.size();

    }


}
