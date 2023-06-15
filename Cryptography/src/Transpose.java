/* Elizabeth Fassler and Abril Calderale
   COP 3337 Assignment 2
*/
public class Transpose extends Cipher {
    // Constructor to initialize the Transpose with the input text
    Transpose(String s) {
        super(s);
    }
    // Encode the word by reversing its characters
    public String encode(String word) {
        StringBuilder result = new StringBuilder(word);
        result.reverse();
        return result.toString();
    }
    // Decode the word by reversing its characters (same as encoding)
    public String decode(String word) {
        StringBuilder result = new StringBuilder(word);
        result.reverse();
        return result.toString();
    }
}

