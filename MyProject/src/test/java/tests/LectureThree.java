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

    @Test
    public void Test2(){
        String newString = "Lorem ipsum dolor sit amet consectetur adipiscing elit quisque tellus sapien tincidunt porta orci ut";

        System.out.println(count(newString) + " words.");

    }

    int count(String newString) {
        int count =0;

        char ch[]= new char[newString.length()];
        for(int i=0;i<newString.length();i++)
        {
            ch[i]= newString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }


}
