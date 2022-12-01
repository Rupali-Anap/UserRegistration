package Nineteen;
import java.util.Scanner;
import java.util.regex.*;

public class LastName {

        public static void main(String[] args) {
            // get user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first name:");
            String firstName = scanner.nextLine();

            System.out.println("Please enter last name:");
            String lastName = scanner.nextLine();

            // validate user input and display error message
            System.out.println("\nValidate Result:");

            if (!validateFirstName(firstName))
                System.out.println("Invalid First Name");
            else
            if(!validateLastName(lastName))
                System.out.println("Invalid Last Name");

            else
                System.out.println("Valid First Name. Thank you.");
        }

        // validate first name
        public static boolean validateFirstName(String firstName) {
            return firstName.matches("[A-Z]{1}[a-z]{3}");
        }

        private static boolean validateLastName(String lastName) {
            return lastName.matches("[A-Z]{1}[a-z]{3,6}");
        }

    }

