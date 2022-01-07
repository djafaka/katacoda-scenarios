There are two kinds of data types in Java: &quot;primitive&quot; and &quot;reference&quot;. Let's start with primitive types.

## Primitive Data Types
Variables for primitive types hold a value. This is typically a numeric value, with one exception: boolean (true or false).
The majority of Java's primitive types are integral (no decimal) and we'll cover those first.

### Integral Types
`long` is the largest of the integral types. It holds 64 bits of information and ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (that's **quintillion**). When declaring a `long` value, the number needs an "L" suffix.    
Example: `long bigNumber = 19283958329L;`

*__Note__*: Do not use thousands separators. Only digits.

`int` is a tad smaller, coming in at 32 bits. This is more commonly used and can represent values between -2,147,483,648 and 2,147,483,647. This is a commonly used integral primitive type.  
Example: `int playerScore = -1052;`

`short` is smaller yet. This one gives you 16 bits to play with. Are you sensing a pattern yet? Each type is half the size of it's larger counterpart. With 16 bits you get numbers ranging from -32,768 to 32,767.  
Example: `short notLong = 3890;`

`byte` is the smallest integral sibling. It's only 8 bits tall, giving an effective range of -128 to 127. Yes, it is small. Yes, it can be useful.  
Example: `byte babySize = 37;`

`char` represents a unicode character with 16 bits. Yes, it's an integral type. For a letter. And it ranges from 0 to 65,535. &quot;Wait a second&hellip;&quot;, you say. &quot;That 16-bit short has a different range.&quot; Yes, but the `char` data type is unsigned. It is always positive. And it always holds **one** character. Just one.  
Example: `char letterA = 'A';`

*__Note__*: Characters are surrounded by single quotes (programmer speak for apostrophes). You may have noticed Strings use double quotes for their values. Don't confuse the two.

#### Curiosity Killed the Cat
Good thing you're not a cat.

Wonder what happens when you add 1 to a variable at its maximum value? Try it out.  
In the editor window, open `NumberFun.java`. Just click the filename to the right and it will open.  

Declare a new `short` variable with a value of 32767 inside the "main" method. Hint: it says `// Put your code here.` where you should declare it. Follow the example above as a guide.

Next, on a new line (press Enter), add 1 to the value of your variable. 
There are a few ways to do that (try all of them). I'll use the `notLong` identifier name. Replace it with whatever you named your variable.  

Option 1: a normal assignment operation
<pre class="file">
    // Note: the funny notation here makes sure the result of the equation is a short. This is known as explicit typecasting.
    notLong = (short)(notLong + 1);
</pre>

Option 2: shorthand assignment
<pre class="file">
    // "+=" means "add the value on the right to the value on the left and assign the result to the identifier on the left."
    notLong += 1;
</pre>

Option 3: increment operator (++)
<pre class="file">
    // This increments the value of the identifier by one.
    notLong++;
</pre>
You can also prefix the increment operator like this: 
<pre class="file">
    // Prefix increment
    ++notLong;
</pre> 
More discussion on this in a later lesson.  
  
Finally, on a new line (yes, Enter again), print out the value with 
<pre class="file">
    System.out.println(notLong);
</pre>

Compile and run your program. See what happens. You shouldn't get an error. If you do, you typed something incorrectly. Surprised by the result?

Here is one more experiment similar to option 1.
<pre class="file">
    // The explicit typecasting has been removed.
    notLong = notLong + 1;
</pre>

Try to compile it. You should get an error. Why? The compiler is being your friend. It's letting you know there is a data integrity problem. Something this friendly could have saved a $7 billion rocket from exploding: [Ariane 5 Overflow Bug](https://around.com/ariane.html).