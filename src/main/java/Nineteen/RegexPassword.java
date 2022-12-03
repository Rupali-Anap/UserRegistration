package Nineteen;
import java.util.Scanner;

public class RegexPassword {

        public static void main(String[] args) {
            // get user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Passord:");
            String password = scanner.nextLine();

            // validate user input and display error message
            System.out.println("\nValidate Result:");
            if(!validatePassword(password))
                System.out.println("Invalid Password");
            else
                System.out.println("Valid Input. Thank you.");
        }

//	 validate first name

        private static boolean validatePassword(String password) {
            return password.matches("[A-Z]{1}[a-z]{8}");
        }

    }

