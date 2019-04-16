package tests;


import org.testng.annotations.Test;

public class LectureOne {

    @Test
    public void firstTest() {

        char firstLetter = 0x0042;
        char secondLetter = 0x006f;
        char thirdLetter = 0x0072;
        char fourthLetter = 0x0069;
        char fifthLetter = 0x0073;

        System.out.print("Name: " + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter);

    }

    @Test
    public void secondTest() {

        char firstLetter = 66;
        char secondLetter = 111;
        char thirdLetter = 114;
        char fourthLetter = 105;
        char fifthLetter = 115;

        System.out.print("Name: " + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter);

    }

    @Test
    public void thirdTest() {

        char backlash = 0x005c;
        char singleQuote = 0x2019;
        char doubleQuotes = 0x0022;

        System.out.print ("" + backlash + singleQuote + "Hello" + singleQuote + backlash + "to" + backlash + backlash + backlash + doubleQuotes + "World" + doubleQuotes + backlash + singleQuote);

    }

    @Test
    public void fourthTest() {

        short minValue = -32768;
        short maxValue = 32767;

        System.out.println("Min value: " + minValue + '\n' + "Max value: " + maxValue);

    }



}
