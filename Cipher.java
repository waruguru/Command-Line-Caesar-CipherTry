//decoding class takes encryptedText and decrypts it.
public class Cipher {
    public String encryptedText;
    public String decryptedText;
    public int encryptingKey;

    //constructor with various parameters.
    public Cipher(String encryptedText, String decryptedText, int encryptingKey) {
        this.encryptedText = encryptedText;
        this.decryptedText = decryptedText;
        this.encryptingKey = encryptingKey;
    }

    public String getDecryptedText() {
        return decryptedText;
    }
}