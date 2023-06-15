import javax.swing.JOptionPane;
public class TestEncryption {
    public static void main(String[] arg) {
        String code, output = "";

        // Get the input text from the user using a dialog box
        String text = JOptionPane.showInputDialog("Enter message:", "The quick brown fox");
        output += "The original message is\n" + text + "\n";

        // Encrypt and decrypt using the Caesar cipher
        Cipher c = new Caesar(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCaesar Cipher\nThe encrypted message is:\n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted message is:\n" + code + "\n";

        // Encrypt and decrypt using the Transpose cipher
        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is:\n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted Transpose message is:\n" + code + "\n";

        // Encrypt and decrypt using the Reverser cipher
        Reverser r = new Reverser(text);
        r.encrypt();
        code = r.reverseText(code);
        output += "\nReverser\nThe encrypted Reverse message is:\n" + code + "\n";
        code = c.decode(code);
        output += "The decrypted Reverse message is:\n" + code;

        // Display the output in a dialog box
        display(output);
    }
    // Method to display the output in a dialog box
    static void display(String s) {
        JOptionPane.showMessageDialog (null, s, "Encrypt/decrypt", JOptionPane.INFORMATION_MESSAGE);
    }
}
