Having trouble getting it to work? This should help.

## Example Solution
<pre class="file" data-filename="NumberFun.java" data-target="replace">
public class NumberFun {
  public static void main(String[] args) {
    short notLong = 32767;
    notLong += 1;
    System.out.println(notLong); // this will print -32768
  }
}
</pre>