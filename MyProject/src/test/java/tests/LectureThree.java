package tests;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LectureThree {

    @Test
    public void test1(){
        System.out.println("\n=====================================\n");

//        boolean isPalindrome = false;
//
//        for (int i=0 , j=myWord.length()-1 ; i<j ; i++ , j-- ) {
//
//            if ( myWord.charAt(i) != myWord.charAt(j) )
//            {
//                isPalindrome = false;
//            }
//            else
//                isPalindrome = true;
//        }
//        for (int i=0 , j=myWord2.length()-1 ; i<j ; i++ , j-- ) {
//
//            if ( myWord2.charAt(i) != myWord2.charAt(j) ) {
//                isPalindrome = false;
//            }
//            else
//                isPalindrome = true;
//        }
        String myWord = "civic";
        String myWord2 = "random";
        boolean isPalindrome = true;

        for (int i=0 , j=myWord.length()-1 ; i<j ; i++ , j-- ) {

            if ( myWord.charAt(i) != myWord.charAt(j) ) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("The word is a Palindrome.");
        }
        else
            System.out.println("The word is NOT a Palindrome.");


        boolean isPalindrome2 = true;

        for (int i=0 , j=myWord2.length()-1 ; i<j ; i++ , j-- ) {

            if ( myWord2.charAt(i) != myWord2.charAt(j) ) {
                isPalindrome2 = false;
                break;
            }
        }

        if (isPalindrome2){
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

    private int count(String newString) {
        int count =0;

        char[] ch = new char[newString.length()];
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
        System.out.println("The letter A is repeated " + countLetter(testThreeString, 'a') + " times.");
        System.out.println("The letter S is repeated " + countLetter(testThreeString, 's') + " times.");
        System.out.println("The letter E is repeated " + countLetter(testThreeString, 'e') + " times.");


        System.out.println("\n=====================================\n");

    }
    private int countLetter(String testThreeString, char letter) {
        int countLetter =0;

        char[] ch = new char[testThreeString.length()];
        for(int i=0;i<testThreeString.length();i++)
        {
            ch[i]= testThreeString.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]==letter)) )
                countLetter++;
        }
        return countLetter;
    }
//    private int countS(String testThreeString) {
//        int countS =0;
//
//        char[] ch = new char[testThreeString.length()];
//        for(int i=0;i<testThreeString.length();i++)
//        {
//            ch[i]= testThreeString.charAt(i);
//            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]=='s')) )
//                countS++;
//        }
//        return countS;
//    }
//    private int countE(String testThreeString) {
//        int countE =0;
//
//        char[] ch = new char[testThreeString.length()];
//        for(int i=0;i<testThreeString.length();i++)
//        {
//            ch[i]= testThreeString.charAt(i);
//            if( ((i>0)&&(ch[i]!=' ')&&(ch[i]=='e')) )
//                countE++;
//        }
//        return countE;
//    }

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

//        testFiveString = testFiveString.toUpperCase();

        char[] ch = new char[testFiveString.length()];
        for(int i=0;i<testFiveString.length();i++)
        {
            ch[i]= testFiveString.charAt(i);
            if (Character.isUpperCase(ch[i])){
//            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                ch[i] = Character.toLowerCase(ch[i]);
             }
            else
                ch[i] = Character.toUpperCase(ch[i]);
            System.out.print(ch[i]);
        }


        System.out.println("\n=====================================\n");


    }

    @Test
    public void test6(){


        for (int i=1; i<=100; i++){

//            if (i<10){
//                System.out.println("your.name+00" + i + "@mentormate.com");
////            }
////            if (i>=10 && i<100){
//                System.out.println("your.name+0" + i + "@mentormate.com");
//            }
//            if (i==100){
                System.out.println("your.name+" + String.format("%03d", i) + "@mentormate.com");
//            }
        }

        System.out.println("\n=====================================\n");

    }

    @Test
    public void test7(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        System.out.println("your.name+" + currentDate + "@mentormate.com");

        System.out.println("\n=====================================\n");
    }

    @Test
    public void test8(){
        String testEightString = "Lorem ipsum dolor sit";

        int cnt = 0;
        char[] inp = testEightString.toCharArray();
        System.out.println("Duplicate Characters are: ");
        for (int i = 0; i < testEightString.length(); i++) {
            for (int j = i + 1; j < testEightString.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j] + " ");
                    cnt++;
                    break;
                }
            }
        }

        System.out.println("\n=====================================\n");

    }

    @Test
    public void test9(){
        String testNineString = "<b>“our string %Welcome to mentorm@te1.com”</b>";
        System.out.println("The number of symbols in the string is: " + testNineString.length());
    }


}
