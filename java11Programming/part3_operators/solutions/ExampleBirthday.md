Here's what your code might look like if your birthday is March 3<sup>rd</sup>.
<pre class="file">
public class Operators {
  public static void main(String args[]) {
    // This is an example for a March 14th birthday.
    float bday = 7f;
    bday = bday * 3;  // Multiply by month of birth
    bday = bday - 1;
    bday = bday * 13;
    bday = bday + 14;  // Add day of birth
    bday = bday + 3;
    bday = bday * 11;
    bday = bday - 3; // Subtract month of birth
    bday = bday - 14;  // Subtract day of birth
    bday = bday / 10;
    bday = bday + 11;
    bday = bday / 100;
    
    // This will print 3.14
    System.out.println(bday);
  }
}
</pre>