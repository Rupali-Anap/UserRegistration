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

// validate password

        private static boolean validatePassword(String password) {
            return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        }

    }

