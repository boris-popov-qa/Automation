package homework;


public class PasswordValidation {

    //Method for HomeworkFive - Test6


    public static void validPassword(String password) {

        boolean valid = true;

        //Password length validation
        if (password.length() < 8) {
            System.out.println("Password should be at least 8 characters in length!");
            valid = false;
        }
        if (password.length()>16) {
            System.out.println("Password should be no more than 16 characters in length!");
            valid = false;
        }

        //Password has at least 1 Uppercase letter validation (I used a little help from google here)
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password should contain at least one upper case letter!");
            valid = false;
        }

        //Password has only letters and digits validation (I used a little help from google here)
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (password.matches(specialChars ))
        {
            System.out.println("Password should contain only letters and digits!");
            valid = false;
        }

        //Password has at least 2 digits validation (I used a little help from google here)
        char c;
        int count = 0;
        for (int i = 0; i < password.length() - 1; i++) {
            c = password.charAt(i);
             if (Character.isDigit(c)) {
                count++;
             }
        }
        if (count < 2)   {
            System.out.println("Password should have at least 2 digits!");
            valid = false;
        }

        //Print message if Password meets all the above criteria.
        if (valid)
        {
            System.out.println("Password is valid.");
        }


    }





}
