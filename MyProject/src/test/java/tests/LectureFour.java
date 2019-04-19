package tests;

import org.testng.annotations.Test;

import java.util.*;

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

    @Test
    public void test4(){
        String [] anotherArray ={"This", "is", "how",  "we", "roll", "arrays"};

        List<String> stringList = new ArrayList<String>(Arrays.asList(anotherArray));

        System.out.println(stringList);


        System.out.println("\n====================================================\n");

    }

    @Test
    public void test5(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("This");
        stringList.add("is");
        stringList.add("how");
        stringList.add("we");
        stringList.add("roll");
        stringList.add("arrays");

        Object[] toArray = stringList.toArray();
        System.out.println(Arrays.toString(toArray));


        System.out.println("\n====================================================\n");
    }

    @Test
    public void test6(){
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("This");
        stringLinkedList.add("is");
        stringLinkedList.add("how");
        stringLinkedList.add("we");
        stringLinkedList.add("roll");
        stringLinkedList.add("arrays");

        Collections.reverse(stringLinkedList);

        System.out.println("The LinkedList elements in reversed order are: ");

        Iterator<String> iterator = stringLinkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n====================================================\n");

    }

    @Test
    public void test7(){
        Map<Integer,String> firstMap = new HashMap<Integer, String>();
        firstMap.put(1,"This");
        firstMap.put(2, "is");
        firstMap.put(3, "how");
        firstMap.put(4, "we");
        firstMap.put(5, "roll");
        firstMap.put(6, "arrays");

        System.out.println("First map: "+ firstMap);


        Map<Integer,String> secondMap = new HashMap<Integer, String>();
        secondMap.putAll(firstMap);

        System.out.println("Second map: " + secondMap);


        System.out.println("\n====================================================\n");

    }
    @Test
    public void test8(){
        Map<Integer,String> newMap = new HashMap<Integer, String>();
        newMap.put(11,"This");
        newMap.put(12, "is");
        newMap.put(13, "how");
        newMap.put(14, "we");
        newMap.put(15, "roll");
        newMap.put(16, "arrays");

        if (newMap.containsValue("This")){
            System.out.println(newMap);
        }
        else
            newMap.put(1, "This");
        System.out.println(newMap);

        if (newMap.containsValue("That")){
            System.out.println(newMap);
        }
        else
            newMap.put(2, "That");
        System.out.println(newMap);

        System.out.println("\n====================================================\n");

    }


}


