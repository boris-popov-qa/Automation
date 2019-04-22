package tests;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LectureThree {


    @Test
    public void test1(){
        System.out.println("\n=====================================\n");


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


        System.out.println("\n=====================================\n");

    }

    @Test
    public void test2(){
        String newString = "Lorem ipsum dolor sit amet consectetur adipiscing elit quisque tellus sapien tincidunt porta orci ut";

        System.out.println(count(newString) + " words.");


        System.out.println("\n=====================================\n");

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

    @Test
    public void test3(){
        String testThreeString = "Lorem ipsum dolor sit amet consectetur adipiscing elit quisque tellus sapien tincidunt porta orci ut";
        System.out.println("The letter A is repeated " + countA(testThreeString) + " times.");
        System.out.println("The letter S is repeated " + countS(testThreeString) + " times.");
        System.out.println("The letter E is repeated " + countE(testThreeString) + " times.");


        System.out.println("\n=====================================\n");

    }
    int countA(String testThreeString) {
        int countA =0;

        char ch[]= new char[testThreeString.length()];
        for(int i=0;i<testThreeString.length();i++)
        {
            ch[i]= testThreeString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]=='a')) )
                countA++;
        }
        return countA;
    }
    int countS(String testThreeString) {
        int countS =0;

        char ch[]= new char[testThreeString.length()];
        for(int i=0;i<testThreeString.length();i++)
        {
            ch[i]= testThreeString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]=='s')) )
                countS++;
        }
        return countS;
    }
    int countE(String testThreeString) {
        int countE =0;

        char ch[]= new char[testThreeString.length()];
        for(int i=0;i<testThreeString.length();i++)
        {
            ch[i]= testThreeString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]=='e')) )
                countE++;
        }
        return countE;
    }

    @Test
    public void test4(){
        String testFourString = "Lorem ipsum dolor sit amet consectetur adipiscing elit quisque tellus sapien tincidunt porta orci ut";
        String reverse ="";

        for(int i = testFourString.length() - 1; i >= 0; i--)
        {
            reverse = reverse + testFourString.charAt(i);
        }

        System.out.println(reverse);


        System.out.println("\n=====================================\n");
    }

    @Test
    public void test5(){
        String testFiveString = "Lorem Ipsum Dolor Sit Amet Consectetur Adipiscing Elit Quisque Tellus Sapien Tincidunt Porta Orci Ut";

        testFiveString = testFiveString.toUpperCase();

        char[] ch = new char[testFiveString.length()];
        for(int i=0;i<testFiveString.length();i++)
        {
            ch[i]= testFiveString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                ch[i] = Character.toLowerCase(ch[i]);
            System.out.print(ch[i]);
        }


        System.out.println("\n=====================================\n");


    }

    @Test
    public void test6(){

        for (int i=1; i<=100; i++){
            if (i<10){
                System.out.println("your.name+00" + i + "@mentormate.com");
            }
            if (i>=10 && i<100){
                System.out.println("your.name+0" + i + "@mentormate.com");
            }
            if (i==100){
                System.out.println("your.name+" + i + "@mentormate.com");
            }
        }

        System.out.println("\n=====================================\n");

    }

    @Test
    public void test7(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        System.out.println("your.name+" + currentDate + "@mentormate.com");
    }



}
