//import console to let the user input
//Encrypting class takes input and
import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Please Enter the message to Encrypt");
        String text = console.readLine();//lets the user input
//        text[] allText = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z}
        public boolean checkType (text.checkType){//public method since it is available to everyone
            if (text !=string){
                System.out.println("Please Enter a string ");

            }
            else{
                System.out.println("You have entered correct datatype:");
            }

        }

        String encryptedText;

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