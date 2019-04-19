package tests;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LectureFour {

    @Test
    public void test1() {
        System.out.println("\n====================================================\n");


        int [] intArray = {1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        String [] stringArray = new String[intArray.length];

        for (int i=0; i < intArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }

        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray));


        System.out.println("\n====================================================\n");
    }

    @Test
    public void test2() {
        int [] intArray = {1788, 2025, 1869, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        int numbersSum=0;

        for (int arrayElement : intArray) {

            numbersSum += arrayElement;

        }

        System.out.println("The sum of the numbers in the array is: "+ numbersSum);


        System.out.println("\n====================================================\n");
    }

}
