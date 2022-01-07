# What's In  a Name?
"A rose by any other name would smell as sweet&hellip;" except in programming.
When it comes to code, using good identifiers is _really_ important. It's important for readability, preventing certain kinds of bugs, and for maintainability.

The programming language determines what a valid identifier is. Some have silly rules like "It must be a single, capital letter." Some are very generous and allow just about anything, leaving it up to the discretion of the programmer.

Whatever the limitations are (or lack thereof), you should do what makes sense. To you, and to someone else who may read your code.

## Memory Lane
You might recall this simple program from the last session (part 1).
<pre class="file">
public class HelloWorld
{
    public static void main(String[] args) {
        // This will hold the name you enter.
        String yourName;
        
        System.out.println("Type your name, please: ");
        
        // This will wait for you to type something, and store it in yourName when you hit Enter.
        yourName = System.console().readLine();
        
        System.out.println("Nice to meet you, " + yourName);
    }
}
</pre>

In all this hubbub there are only four identifiers:
1. "HelloWorld" (the class identifier)
2. "main" (name of the main method)
3. "args" (the "main" method String[] argument identifier)
4. "yourName" (a String variable identifier)

All of these identifiers have a good name (at least in my opinion). Here's why:
- "HelloWorld" is descriptive enough about what it contains: the Hello World program.
- "args" is an acceptable abbreviation for "arguments"
- "yourName" gives you a blatant hint about what it should refer to.

### Naming Rules
Each language has different rules on what a "valid" identifier is.
In Java, valid names:
- Have an unlimited length
- Begin with A-Z, a-z, underscore (\_) or dollar sign ($)
- Additional characters can contain any of the above, along with numbers.
- Cannot be a [keyword](https://en.wikipedia.org/wiki/List_of_Java_keywords "Java Keywords").

#### Valid Identifiers
These are examples of valid identifiers. They aren't all &quot;_good_,&quot; but they're all valid.
```
thisIsAChicken
_thisIsAlsoAChicken
I_Have_9_articHOKEs
$dollarNamed
NineArtichokes_cost_$10
```

#### Invalid Identifiers
These are all invalid:
```
9times              // can't start witha number
Spac35 are a N0 N0  // sorry, no spaces
class               // can't use a keyword
```

## Fill In the Blank
Time to practice.

Copy this to the editor:
<pre class="file" data-filename="NameThatThing.java" data-target="replace">/**
 * A simple exercise in naming identifiers.
 * Give each missing identifier a valid name.
 */
// Replace comments that look like /* identifier # */ with a valid name.
public class /* identifier 1 */ {

  // Name of the identifier
  private static String /* identifier 2 */ = "A Name";

  /**
   * Method to print the identifer name to the terminal.
   */
  static void /* identifier 3 */() {
    System.out.println("The name is: " + /* identifier 2 */);
  }

  public static void main(String[] args) {
    // Call the method to print the name.
    /* identifier 3 */();
  }
}
</pre>

There are 3 missing identifiers:
- /\* identifier 1 \*/ is a class identifier. In Java, a "public" class identifier must be exactly the same as the filename.
- /\* identifier 2 \*/ is a variable identifier. In this case, it holds the name of the thing. Feel free to change "A Name" to something more meaningful.
- /\* identifier 3 \*/ is a method identifier. This method prints the name of the thing. Name the method appropriately.

Your task: replace the name placeholder (/\* identifier \*/) with a valid name.

Once they are filled in, compile the program and run it. If it doesn't compile, make sure the identifiers are valid.

Remember:  
To compile, type `javac NameThatThing.java`{{execute}} in the terminal.  
To run, type `java NameThatThing`{{execute}} in the terminal.

