package tests;

import homework.TestMethods;
import org.testng.annotations.Test;

import java.util.List;


public class HomeworkFive {

    @Test
    public void test1(){
        System.out.println("\n=====================================\n");


        TestMethods.smallestNumber(37, 25,19);


        System.out.println("\n=====================================\n");
    }


    @Test
    public void test2(){
        TestMethods.testTwoMethod("I love writing methods so much.");

        System.out.println("\n=====================================\n");
    }

    @Test
    public void test3(){
        List listSize = TestMethods.testThreeMethodOne("Did I tell you how much I love writing methods.");
        System.out.println(TestMethods.testThreeMethodTwo(listSize));


        System.out.println("\n=====================================\n");

    }
    @Test
    public void test4(){
        TestMethods.interestCalc(10000,5,10);


        System.out.println("\n=====================================\n");

    }

    @Test
    public void test5(){
        TestMethods.leapYear(2020);

        System.out.println("\n=====================================\n");
    }



}
