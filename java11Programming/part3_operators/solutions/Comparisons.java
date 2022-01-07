package solutions;

import java.util.Scanner;

public class Comparisons {
    // Variables to hold two numbers.
    private static int firstNumber, secondNumber;

    /**
     * This method prompts the user for two numbers.
     */
    private static void getNumbers() {
        // Reads from system input.
        Scanner input = new Scanner(System.in);
        String inputValue;
        
        System.out.print("\nEnter an integer: ");
        firstNumber = input.nextInt(); // get number input.
        
        System.out.println("Enter another integer:");
        secondNumber = input.nextInt(); // get number input.
    }

    /**
     * Asks the user a question and expects a yes or no answer.
     * @param question The question to ask.
     * @return The response converted to a boolean value. True for yes, false for no.
     */
    private static boolean promptForYesNo(String question) {
        // Reads from system input.
        Scanner input = new Scanner(System.in);
        
        System.out.print(question + " (Enter Yes or No): ");
        String response = input.nextLine();
        
        // Check the response to see if it is valid
        switch(response.toUpperCase().trim()) {
            case "YES":
                return true;
            case "NO":
                return false;
            // Invalid entry. Something other than YES or NO
            default:
                System.out.println("Invalid response. Please enter Yes or No.");
                // this will prompt the user again.
                return promptForYesNo(question);
        }
    }

    /**
     * Runs all the comparisons and prints the results.
     */
    private static void compare() {
        System.out.println("---------------------------------------");
        System.out.println("Running comparisons:");
        System.out.println(firstNumber + " == " + secondNumber + "? " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " != " + secondNumber + "? " + (firstNumber != secondNumber));
        System.out.println(firstNumber + " > " + secondNumber + "? " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + "? " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + "? " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + "? " + (firstNumber <= secondNumber));
        System.out.println("---------------------------------------");
    }
    
    public static void main(String args[]) {
        boolean askForNumbers = true;
        
        do {
            // Prompt for numbers
            Comparisons.getNumbers();
            // Run the comparison
            Comparisons.compare();
            // See if the user wants to run more comparisons.
            askForNumbers = Comparisons.promptForYesNo("Do another comparison?");
            
        } while (askForNumbers);

        System.out.println("Bye!");
    }
}
