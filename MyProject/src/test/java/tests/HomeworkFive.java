package tests;

import org.testng.annotations.Test;

public class HomeworkFive {
    //Method for Test1
    public void smallestNumber(int a, int b, int c){

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
    @Test
    public void test1(){
        smallestNumber(37, 25,19);
    }
}
