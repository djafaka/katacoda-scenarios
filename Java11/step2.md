Let&apos;s take the source apart to explain some concepts.

## Keywords
All languages have `keywords`. These are the vocabulary the compiler understands. They have special meaning. The Hello World program uses four of them:
`public`, `class`, `void`, and `static`. I&apos;m not going to explain them all here. We will come back to that.

## Identifiers
Turn your attention to this line of code:
<pre class="file">
public class HelloWorld 
</pre>
Here, `HelloWorld` is an &ldquo;**Identifer**.&rdquo; Identifiers are simply names the programmer gives to something, so it can be referred to other places in the program. In this case, we are naming our `class` HelloWorld.

In Java, **identifers** are used to name variables, classes, interfaces, packages, and methods. Don&apos;t worry if you don&apos;t know what some of those terms are. It will be covered.

## Code Blocks
The &quot;curly braces&quot; (`{` and `}`) surround logical blocks of code. It tells the compiler where a section of code begins and ends. Different languages may use different ways to define blocks, but they all serve the same purpose.

In the case of our simple Hello World program,
<pre class="file">
public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
</pre>
can be read as &quot;The `main` **method** belongs to my HelloWorld class, and `main` contains the code to print my message.&quot;

## Values
Take a look at the section of code that does the heavy lifting:
<pre class="file">
System.out.println("Hello, World!");
</pre>
`"Hello, World!"` is a &quot;String Literal.&quot; 
What we would normally call a &quot;sentence&quot; in our vocabulary, is called a &quot;string&quot; in programmer speak. 
Why? Someone thought themselves clever I suppose. It is one or more &quot;characters&quot; strung together.

And in this case, it is a literal value. It is what it is. It cannot be anything other than &quot;Hello, World!&quot;

Hey, what a great time to discuss variables! Go on, click the `Continue` button.