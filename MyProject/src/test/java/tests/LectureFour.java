package tests;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
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

    @Test
    public void test3() {
        int [][] newArray = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17},
                {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
        };
        System.out.println("First array: ");
        for (int i = 0; i < newArray.length; i++){

            for (int j = 0; j < newArray[i].length; j++){

                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Second array: ");

        String [][] secondArray = {
                {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                {null, null, null, null, null, null, null},
                {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}
        };

        for (int i = 0; i < secondArray.length; i++){

            for (int j = 0; j < secondArray[i].length; j++){

                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();

        }



        System.out.println("\n====================================================\n");



    }

}
