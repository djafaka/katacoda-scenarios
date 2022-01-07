## Primitive Data Types Continued 
Enough integrals. What about real numbers? Like, the ones with decimal points? For this we move on to floating-point numbers.  

This step doesn't have any guided examples (sorry). Just try things out.

### Floating-Point Types
`float` is a 32-bit data type. The range is a bit different from the integral types. The reason why is _way_ outside the scope of this lesson. The magnitude of a float is approximately
between 1.4&times;10<sup>-45</sup> to 3.4&times;10<sup>38</sup> (whether positive or negative);

Float values need to be followed by an 'F' or 'f.'  
Examples:
<pre class="file">
float pi = 3.14F;
float justOne = 1f;
float 32.F;
</pre>

`double` increases the size to 64 bits. The magnitude range is between 4.9&times;10<sup>-324</sup> to 1.7&times;10<sup>308</sup>.

Double values _can_ be followed by a 'D' or 'd.' But they don't have to be.  
Examples:
<pre class="file">
double myDouble = 841.382348;
double anotherDouble = -10D;
double sillyDouble = 42.D;
</pre>

#### Infinity and NaN
If you need to use infinity or NaN (not a number), float and double are your friend. There are some constants defined:
- Float.POSITIVE_INFINITY
- Float.NEGATIVE_INFINITY
- Float.NaN
- Double.POSITIVE_INFINITY
- Double.NEGATIVE_INFINITY
- Double.NaN

Considering we haven't covered "constants," a constant is similar to a variable. Except that the value cannot change.

#### A bizarre side-effect
The way real numbers are represented has a neat side effect. There is 0 and -0. Yes. Negative zero.
Although they are considered equal in Java.

### Boolean
This will be a short section. `boolean` identifiers hold one of two values: `true` or `false`. Literally.  
Examples:
<pre class="file">
boolean thisIsntTrue = false;
boolean somethingTrue = true;
</pre>

### Last Note on Numbers
Even though you can't use normal &quot;thousands separators,&quot; you can use one or more underscores between digits to make large numbers easier to read in Java.  
Example:
<pre class="file">
long aBigNumber = 12_338_371_938_281;
float someRealNumber = 12.832_182_994F;
</pre>

Lets move on to reference types.