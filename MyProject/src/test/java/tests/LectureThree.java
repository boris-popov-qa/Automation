package tests;

import org.testng.annotations.Test;

public class LectureThree {
    @Test
    public void Test1(){
        String myWord = "civic";
        String myWord2 = "random";
        boolean isPalindrome = false;

        for (int i=0 , j=myWord.length()-1 ; i<j ; i++ , j-- ) {

            if ( myWord.charAt(i) != myWord.charAt(j) ) {
                isPalindrome = false;
            }
            else
                isPalindrome = true;
        }
        if (isPalindrome){
            System.out.println("The word is a Palindrome.");
        }
        else
            System.out.println("The word is NOT a Palindrome.");



        for (int i=0 , j=myWord2.length()-1 ; i<j ; i++ , j-- ) {

            if ( myWord2.charAt(i) != myWord2.charAt(j) ) {
                isPalindrome = false;
            }
            else
                isPalindrome = true;
        }
        if (isPalindrome){
            System.out.println("The word is a Palindrome.");
        }
        else
            System.out.println("The word is NOT a Palindrome.");





    }
}
