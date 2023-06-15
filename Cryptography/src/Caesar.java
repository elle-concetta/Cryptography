/* Elizabeth Fassler and Abril Calderale
   COP 3337 Assignment 2
*/
public class Caesar extends Cipher {
    // Constructor to initialize the Caesar cipher with the input text
    public Caesar(String s) {
        super(s);
    }
    // Encode the word using the Caesar cipher
    public String encode(String word) {
        return code(word, Constants.ENCODE_SHIFT);
    }
    // Decode the word using the Caesar cipher
    @Override
    public String decode(String word) {
        return code(word, Constants.DECODE_SHIFT);
    }
    // Helper method to perform encoding/decoding based on the shift value
    String code(String word, int SHIFT) {
        StringBuilder result;
        result = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, SHIFT);
            result.append(ch);
        }
        return result.toString();
    }
    // Determines the encoded/decoded character based on the shift value
    public char determineCharacter(char ch, final int shift) {
        if (Character.isUpperCase(ch))
            ch = (char) ('A' + (ch - 'A' + shift) % Constants.WRAP_AROUND);
        if (Character.isLowerCase(ch))
            ch = (char) ('a' + (ch - 'a' + shift) % Constants.WRAP_AROUND);
        return ch;
    }
}
