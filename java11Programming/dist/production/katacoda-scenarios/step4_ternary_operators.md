You've probably guessed this by now: Ternary operators operate on 3 operands. Java only has one ternary operator. It's a funny looking operator with two symbols:
`? :`

The operator symbols get sandwiched between the 3 operands.  
- The first operand is a test that results in `true` or `false`.  
- The second operand is returned _if_ the test is true.  
- The third operand is returned _if_ the test is false.

Here's an example that would print "It's true."  
```
int little = 1;
int big = 388234;
String veritas = little < big ? "It's true." : "It's false.";

System.out.println(veritas);
```
You won't use this operator very often. Some people will even tell you never to use it because it's hard to read.
I happen to disagree. It has its place.