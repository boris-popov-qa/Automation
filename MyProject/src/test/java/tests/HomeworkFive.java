package tests;

import homework.TestMethods;
import org.testng.annotations.Test;

import java.util.List;


public class HomeworkFive {

    @Test
    public void test1(){
        TestMethods.smallestNumber(37, 25,19);
    }


    @Test
    public void testTwo(){
        TestMethods.testTwoMethod("I love writing methods so much.");
    }

    @Test
    public void testThree(){
        List listSize = TestMethods.testThreeMethodOne("Did I tell you how much I love writing methods.");
        System.out.println(TestMethods.testThreeMethodTwo(listSize));

    }



}
