/**
 * This program uses a character to print a shape to the terminal.
 */
public class ShapePrinter {

  // This is the character that will be used to "fill" the shape.
  static final char fillCharacter = '*';

  /**
   * Prints a right-triangle to the screen with a user-defined height.
   * @param triangleHeight Height of the triangle.
   */
  static void printRightTriangle(int triangleHeight) {
    String theTriangle = "";

    // The for loop is what prints the triangle at the correct height.
    for(int currentHeight = 1; currentHeight <= triangleHeight; currentHeight = currentHeight + 1) {

      // This "nested" loop creates the "filler" for the current height.
      for(int fillPosition = 1; fillPosition <= currentHeight; fillPosition = fillPosition + 1) {
        theTriangle = theTriangle + fillCharacter;
      }
      // This adds an "end of line" character to the current fill height, using the \n escape code.
      theTriangle += "\n";

    }

    // Now that the triangle is constructed, print it.
    System.out.println(theTriangle);

  }

  public static void main(String args[]) {
    ShapePrinter.printRightTriangle(4);
  }
}