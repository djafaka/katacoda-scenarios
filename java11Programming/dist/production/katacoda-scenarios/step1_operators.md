# Do Something Useful
Operators: they make programming useful. Without them programs would do, pretty much, nothing. What is it? 
An **operator** is a symbol that performs an action on operands. In Java, it can be one, two or three operands.

What is an operand? It's the thing being operated on by the operator. That could be a few different things. In its simplest form, it would be, perhaps, a number. For example:  
`1 + 2`  
&quot;1&quot; and &quot;2&quot; are operands. &quot;+&quot; is the operator.

The operands don't have to be numbers. They could be variables, or even methods \(covered in another lesson\). They can even be the result of other operators\!

Before we get into those details, let's talk about the different types of operators.

## Unary Operators
Unary operators operate on _one_ operand.

You've already seen one in the previous lesson with the increment operator: ++  
It simply adds 1 to the operand.  
```
int someValue = 0;
someValue++; // Now someValue equals 1.
```

There's also a decrement operator, which subtracts 1.
```
someValue--;
```

Unary operators can use **prefix** or **postfix** notation.  
**Prefix** notation has the operator _before_ the operand. `++someValue;`  
**Postfix** notation has the operator _after_ the operand. `someValue++;`

Does the order matter? It can.
Try it out. Let's write a simple program to see what happens when we print values with prefix vs. postfix.
Copy this skeleton code to the editor window.

<pre class="file" data-filename="Operators.java" data-target="replace">
public class Operators {
  public static void main(String args[]) {
    // Your code will go here.
  }
}
</pre>

Add this code to the editor. Type it!

<pre class="file">
// Starting value
int baseValue = 0;

System.out.println("*************************************");

int firstValue = ++baseValue;
// Print the values
System.out.println("firstValue: " + firstValue );
System.out.println("baseValue: " + baseValue);

int secondValue = baseValue++;
System.out.println("secondValue: " + secondValue); 
System.out.println("baseValue: " + baseValue);

int thirdValue = baseValue--;
System.out.println("thirdValue: " + thirdValue);
System.out.println("baseValue: " + baseValue);

System.out.println("baseValue--: " + baseValue--); // Notice the decrement here
System.out.println("Final baseValue value: " + baseValue);

System.out.println("*************************************");
</pre>

Before you compile and run it, try to predict the output. Write it down.  

After making your prediction, compile and run the code. Here are the commands for the last time (after this I will assume you know how to compile and run your code).  
`javac Operators.java`{{execute}}  
`java Operators`{{execute}}

Did your prediction match the actual results? The reason they turned out like they did is because of operator precedence rules. 
If you go back to rules of mathematics, it is simply the enforced order of operations. We will talk about that more later in this lesson.
For now, it is enough to know that order matters.

Here is a list of all the unary operators in Java. Try them out in the editor window to see them in action.
<table>
<tbody>
    <tr><th>Operator</th><th width="60%">Description</th><th>Example</th></tr>
    <tr>
        <td>+</td>
        <td>Unary plus operator. Indicates positive values.</td>
        <td><pre class="file">int myNumber = +1;</pre></td>
    </tr>
    <tr>
        <td>-</td>
        <td>Unary minus operator. Indicates negative values and negates expressions.</td>
        <td><pre class="file">short myNumber = -1;</pre></td>
    </tr> 
    <tr>
        <td>++</td>
        <td>Unary increment operator. Increments a value by 1.</td>
        <td><pre class="file">myNumber++;</pre></td>
    </tr>        
    <tr>
        <td>--</td>
        <td>Unary decrement operator. Decrements a value by 1.</td>
        <td><pre class="file">myNumber--;</pre></td>
    </tr>        
    <tr>
        <td>!</td>
        <td>Logical compliment (sometimes referred to as &quot;not&quot). It inverts the value of a boolean.</td>
        <td>
            <pre class="file">
boolean changeMe = true;
// Now it's false.
changeMe = !changeMe;
            </pre>
        </td>
    </tr>
</tbody>
</table>

Let's move on to **binary** operators.