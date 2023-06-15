// Constructor to initialize the Reverser with the input text
public class Reverser extends Transpose {
    // Method to reverse a word
    public Reverser(String s) {
        super(s);
    }
    public String reverseText(String word) {
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--){
            // Append each character in reverse order to the result
            reversed += word.charAt(i);
        }
        return reversed;
    }
    // Encode the word using the reverseText method
    public String encode(String word) {
        return reverseText(word);
    }
    // Decode the word using the reverseText method
    public String decode(String word) {
        return reverseText(word);
    }
}

