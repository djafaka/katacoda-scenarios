/**
 * A simple exercise in naming identifiers.
 * Give each missing identifier a valid name.
 */
// Replace comments that look like /* identifier # */ with a valid name.
public class NameThatThing {

  // Name of the identifier
  private static String name = "A Name";

  /**
   * Method to print the identifer name to the terminal.
   */
  static void printName() {
    System.out.println("The name is: " + name);
  }

  public static void main(String[] args) {
    // Call the method to print the name.
    printName();
  }
}