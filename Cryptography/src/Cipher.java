import java.util.StringTokenizer;
public abstract class Cipher {
    private String message;
    StringBuffer encrypted_message, decrypted_message;
    public Cipher(String text) {
        message = text;
    }
    public final void encrypt() {
        // The message string is tokenized into words
        encrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(message);
        while(words.hasMoreTokens()) {
            // Each word is encoded using the abstract encode method
            String s = words.nextToken();
            s = encode(s) + " ";
            encrypted_message.append(s);
        }
    }
    public final void decrypt(String text) {
        // The encoded message string is tokenized into words
        // Supply code that decrypts the encrypted string
        decrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(text);
        while(words.hasMoreTokens()) {
            // Each word is decoded using the abstract decode method
            String s = words.nextToken();
            s = decode(s) + " ";
            decrypted_message.append(s);
        }
    }
    // Get the encoded message
    public String getEncodedMessage() {
        return encrypted_message.toString();
    }
    // Get the decoded message
    public String getDecodedMessage() {
        return decrypted_message.toString();
    }
    // Abstract method to encode a word
    public abstract String encode(String s);
    // Abstract method to decode a word
    public abstract String decode(String s);
}
