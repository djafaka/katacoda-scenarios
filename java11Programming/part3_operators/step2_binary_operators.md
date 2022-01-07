# Binary Operators
Binary operators operate on _two_ operands (thus the 'bi' prefix).

The binary operators all use *infix* notiation. That means the operator goes between the operands. Like this:
<pre class="file">
int myOperand;
myOperand     =     293_378_218;
  &uarr;           &uarr;          &uarr;
operand    operator   operand
</pre>

### Sidebar: whitespace
Notice there are some extra spaces between the operands and the operator. I put them there for readability.  
In Java, whitespace doesn't matter. 
It is ignored. You can put as many spaces, tabs and new lines between statements as you wish. Just keep in mind, readability is important.  
The example above would work if it was written like this:

<pre class="file">
int myOperand;
myOperand = 293_378_218;
</pre>

Or this:

<pre class="file">
int              myOperand
        ;

        myOperand       =
    293_378_218;
</pre>

I'm sure you see how poorly formatted code is much harder to follow. Even for such a simple program!
### Case Sensitivity
Another worthwhile note: **case matters**\! MyVariable is not the same as myVariable. Java is picky about case.

### Assignment Operator
One of the most important binary operators is the **assignment operator**. You've already used it without knowing it. Or maybe you did know it. It looks like this: **=**

##### Declaration
The assignment operator _gives value_ to a **declared** variable. That's a word to know \(declared\). Before you can assign a value to something, the thing needs to be declared. You've been doing this already too.  

<pre class="file">
// declaring an integer variable named myOperand.
int myOperand;
</pre>

Once declared, you can assign a value to it&mdash;as long as the data types are **the same**. If they aren't, you'll need to use typecasting. Typecasting is a discussion for another lesson. For now, we will keep them the same.

Declaration and assignment in action:

<pre class="file">
 // Declaration and assigment on one line.
 // This is the most common usage.
 int myOperand = 4382;
 
 // Declaration of many variables
 byte b1, b2, b3;
 b1 = 2;
 b2 = -16;
 b3 = 38;
 
 // Declare and assign many
 // s3 is not assigned a value here.
 short s1 = 10, s2 = 4821, s3;
 
 // Declare, then assign same value to all.
 long l1, l2, l3;
 l1 = l2 = l3 = 183L;
</pre>

##### Order of Operations
Just like in arithmetic, Java enforces an order of operations \(as do most languages\). We will cover it in more detail later. I bring it up now because the assignment operator is a special case.
```
l1 = l2 = l3 = 183L;
```
In this case, the operations are processed from right to left. The assignment operator will complete any expressions on the right, before assigning a value to the operand on the left. This means we can do things like this:

<pre class="file">l1 = l2 = l3 = 72 + 12;</pre>

72 \+ 12 will be evaluated before being assigned to `l3`, `l2`, and finally `l1`. What makes this so special? All other binary operators are evaluated from left to right. _ONLY_ the assignment operator is evaluated from right to left.

This discussion is getting long. Let's do some exercises. Move along to the next step. Go ahead. Click Continue.  