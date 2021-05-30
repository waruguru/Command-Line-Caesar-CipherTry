//import console to let the user input
import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Please Enter the message to Encrypt");
        String text = console.readLine();//lets the user input

        String encryptedText;
        String decryptedText;
        //declarig an array to hold the encrypting key
        System.out.println("Kindly enter the encrypting key you would love to use:");
        String encryptingKey = console.readLine() ;
        Integer integerEncryptingKey = Integer.parseInt(encryptingKey);


        System.out.println("You are using the encrypting key" + integerEncryptingKey);
        //A string to store the decrypting key;
        Integer decryptingKey = integerEncryptingKey;


        String decryptedText;
        System.out.println("Your decrypted message is:"+decryptedText)





    }
}