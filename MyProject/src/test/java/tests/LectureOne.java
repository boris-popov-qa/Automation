package tests;


import org.testng.annotations.Test;

public class LectureOne {

    @Test
    public void test1() {

        char firstLetter = 0x0042;
        char secondLetter = 0x006f;
        char thirdLetter = 0x0072;
        char fourthLetter = 0x0069;
        char fifthLetter = 0x0073;

        System.out.print("Name: " + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter);

    }

    @Test
    public void test2() {

        char firstLetter = 66;
        char secondLetter = 111;
        char thirdLetter = 114;
        char fourthLetter = 105;
        char fifthLetter = 115;

        System.out.print("Name: " + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter);

    }

    @Test
    public void test3() {

        char backlash = 0x005c;
        char singleQuote = 0x2019;
        char doubleQuotes = 0x0022;

        System.out.print ("" + backlash + singleQuote + "Hello" + singleQuote + backlash + "to" + backlash + backlash + backlash + doubleQuotes + "World" + doubleQuotes + backlash + singleQuote);

    }

    @Test
    public void test4() {

        short minValue = -32768;
        short maxValue = 32767;

        System.out.println("Min value: " + minValue + '\n' + "Max value: " + maxValue);

    }

    @Test
    public void test5() {

        int a = 10;
        int b = 2;
        int c = 17;

        //Adding - the sum of a + c should be 29;
        System.out.println("Adding: " + (a + b + c));

        //Subtracting - the result of c - a should be 7;
        System.out.println("Subtracting: " + (c - a));

        //Multiplication - the result of a * b should be 20;
        System.out.println("Multiplication: " + (a * b));

        //Division - the result of a / b should be 5;
        System.out.println("Division: " + (a / b));

        //Remainder - the result of c % b should be 1;
        System.out.println("Remainder: " + (c % b));
    }

    @Test
    public void test6() {

        String firstName = "John";
        String lastName = "Snow";
        int age = 25;
        String gender = "Male";
        long personalNumber = 8306112507L;
        long employeeNumber = 27560000;

        System.out.println("First name: " + firstName + '\n' + "Last name: " + lastName + '\n' + "Age: " + age + '\n' + "Gender: " + gender + '\n' + "Personal number: " + personalNumber + '\n' + "Employee number: " + employeeNumber);
    }



}
