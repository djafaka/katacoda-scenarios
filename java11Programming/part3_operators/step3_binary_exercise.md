# Time For Exercise\! 
If you _want_ to stand up for a moment and stretch, that might be a good idea. Then you can do the binary exercise.

Start by copying this over to the editor window. We need a clean slate. You can click the "Copy to Editor" button. It will do the work for you.

<pre class="file" data-filename="Operators.java" data-target="replace">
public class Operators {
  public static void main(String args[]) {
    // Your code will go here.
  }
}
</pre>

### Arithmetic Operators
Let's have fun with your birthday to show off arithmetic operators.
We will use addition, subtraction, multiplication and division. You'll want to know most of these operators:

<table>
<caption>Arithmetic Operators Quick Reference</caption>
<tbody>
    <tr><th>Operator</th><th width="60%">Description</th><th>Example</th></tr>
    <tr>
        <td>+</td>
        <td>Binary addition.</td>
        <td><pre class="file">myNumber + 10;</pre></td>
    </tr>
    <tr>
        <td>-</td>
        <td>Binary subtraction.</td>
        <td><pre class="file">myNumber - 48;</pre></td>
    </tr> 
    <tr>
        <td>\*</td>
        <td>Multiplication operator.</td>
        <td><pre class="file">myNumber \* anotherNumber;</pre></td>
    </tr>        
    <tr>
        <td>/</td>
        <td>Division operator.</td>
        <td><pre class="file">myNumber / 8382;</pre></td>
    </tr>
    <tr>
        <td>%</td>
        <td>Modulus operator. Gives the remainder of a division operation.</td>
        <td><pre class="file">4 % 3; // the answer is 1.</pre></td>
    </tr>      
</tbody>
</table>

I'm going to give instructions, you type code in the editor.  
For this exercise, you will do a bit of mathematics to display your birthday as a floating point number. For example, March 14th would look like `3.14`.

Here are the steps. See if you can figure out the code.
1. Declare a `float` and assign the value 7.0f to it \(the f is there on purpose&hellip;it's a floating point variable).  You get to pick the identifier name. For all the steps that follow, you will use this variable and assign the value of the operation back to it.

1. Multiply by the month of your birth. For instance, my birthday is in November, so I would multiply by 11. Alright, I'll give one hint: `birthdayDate = birthdayDate * 11`

1. Subtract 1.

1. Multiply by 13.

1. Add the day of your birth.

1. Add 3.

1. Multiply by 11.

1. Subtract the month of your birth.

1. Subtract the day of your birth.

1. Divide by 10.

1. Add 11.

1. Divide by 100.

1. Print the final result like so: `System.out.println(birthdayDate);`

Compile and run your program. If you did everything correctly, you will see your birthdate as a float value. If the number is wrong, you did something wrong.

If you are having trouble, look at the example solution and try to get yours working.

Once you get it working, change the `float` to an `int` and see what happens. You won't get the same answer.

### Ugly code.
The steps above, if followed exactly, make for ugly code \(see the solution to know what I mean\). We will build on this example to tidy it up. One quick improvement would be to add two more variables. One for the birth month, the other for birth day. We'll discuss that later.

Let's move on to the next type of operator for now.