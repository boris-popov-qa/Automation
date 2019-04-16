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



}
