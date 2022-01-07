## Hello, World!
For this first lesson, you are going to write a traditional first program known as &ldquo;Hello, World!&rdquo;.

What, you ask, is &ldquo;Hello, World!&rdquo; anyhow? It simply prints &ldquo;Hello, World!&rdquo; to the screen.
It isn't terribly exciting. But, it does give us a chance to talk about some important fundamentals.

To the right you should see an editor with a file named `HelloWorld.java.` This is the source code file. Type the code below into the editor (don't copy/paste&hellip;go through the exercise):
<pre class="file">
public class HelloWorld 
{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
</pre>

## Compilers
The computer cannot run the source code. 
We are using a [high-level language](https://en.wikipedia.org/wiki/High-level_programming_language "High-level programming language on Wikipedia"), which the machine doesn&apos;t understand. Source code is for humans.
Thankfully there is a translator that can take our code and turn it into something the computer understands. 
In this case, we use a [compiler](https://en.wikipedia.org/wiki/Compiler "Compiler on Wikipedia") to translate our code into [Java&trade; bytecode](https://www.javaworld.com/article/2077233/core-java/bytecode-basics.html "Java Bytecode Information") .

In some programming languages, an assembler takes what the compiler produces and further translates it to machine language. Machine language is directly executable. In Java, the Java Virtual Machine reads the bytecode and tells the machine what to execute.

## Try It Out
Below the editor window there is a `Terminal.` It should say &ldquo;Your Interactive Bash Terminal. A safe place to learn and execute commands.&rdquo; Click in the terminal and type:
`javac HelloWorld.java`{{execute}} (then press the `enter` key). `javac` is the Java compiler program.

If your source code is correct, it will create a file named `HelloWorld.class`&mdash;your bytecode. If you get errors, check the source code to make sure it matches the example. You can't continue if it doesn&apos;t compile!

Run it in the terminal by typing `java HelloWorld`{{execute}} to see what happens&hellip; You should see &ldquo;Hello, World!&rdquo; displayed. 

Next, we'll discuss parts of the source code.