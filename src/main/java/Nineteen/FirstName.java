package Nineteen;
import java.util.Scanner;
import java.util.regex.*;
public class FirstName {


        public static void main(String[] args) {
            // get user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter name:");
            String firstName = scanner.nextLine();

            // validate user input and display error message
            System.out.println("\nValidate Result:");

            if (!validateFirstName(firstName))
                System.out.println("Invalid Name");

            else
                System.out.println("Valid Name. Thank you.");
        }

        // validate first name
        public static boolean validateFirstName(String firstName) {
            return firstName.matches("[A-Z]{1}[a-z]{3}");
        }

    }


