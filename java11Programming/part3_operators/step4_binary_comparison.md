# Comparison
There is another type of important binary operation: comparison. Comparison operators compare two operands and return a boolean value (true or false).  
<table>
<caption>Comparison Operator Quick Reference</caption>
<tbody>
    <tr><th>Operator</th><th width="60%">Description</th><th>Example</th></tr>
    <tr>
        <td>==</td>
        <td>Equality: tests if operands are equal.</td>
        <td><pre class="file">numberOne == numberTwo;</pre></td>
    </tr>
    <tr>
        <td>!=</td>
        <td>Inequality: tests if operands are not equal.</td>
        <td><pre class="file">numberOne != numberTwo;</pre></td>
    </tr> 
    <tr>
        <td>&gt;</td>
        <td>Greater than</td>
        <td><pre class="file">numberOne &gt; numberTwo;</pre></td>
    </tr>        
    <tr>
        <td>&gt;=</td>
        <td>Greater than or equal to.</td>
        <td><pre class="file">thisNumber &gt;= thatNumber;</pre></td>
    </tr>
    <tr>
        <td>&lt;</td>
        <td>Less than.</td>
        <td><pre class="file">aValue &lt; anotherValue;</pre></td>
    </tr>      
    <tr>
        <td>&lt;=</td>
        <td>Less than or equal to.</td>
        <td><pre class="file">aValue &lt;= anotherValue;</pre></td>
    </tr>
</tbody>
</table>

Let's put this to the test with a program. First you'll need to create a new java source file. In the terminal window (not the editor) type `touch Comparisons.java`{{execute}}.  
In a moment you should see a file named &quot;Comparisons.java&quot; appear in the list of files (to the left of the editor window). Click on it to open it.  

This next example program has a lot more to it than the earlier ones. It has some new things we haven't covered. Don't worry about them for now. They will be covered in the next lesson. Pay attention to the comparisons.
Here is to code to type:

<pre class="file">
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
</pre>

As with the other programs, compile (javac) it and run it (java). If you typed it all correctly, it will ask you to provide two numbers. Then it will run comparisons on the numbers you chose.

That's all for this lesson. Stay tuned for the next lesson where we will talk about flow control and methods.