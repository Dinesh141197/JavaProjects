import java.util.*;
public class passwordGenarator {

    // Stories
    // 1. Users can select the length of the generated password
    // 2. User can select one or multiple of the following. Include uppercase, lowercase, numbers, symbols
    // 3. User can click a copy to clipboard button which will save the password to the clipboard
    // Bonus feature : User can see the password


    static char[] generatePassword(int len) {

        System.out.print("Your password is:");

        String charcaps = "ABCDEFGHIJKLMNOPQUTVSWXYZ";
        String charsmall = "abcdefghijklmnopqtvswxyz";
        String charnumbers = "0123456789";
        String charsymbols = "!@#$%^&*()_-+=*/<>,.";
        String result = charcaps + charsmall + charnumbers + charsymbols;
        Random rand = new Random();

        char [] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = result.charAt(rand.nextInt(result.length()));
        }
        return password;
    }
        public static void main(String [] args){
            int length = 10;
            System.out.println(generatePassword(length));
        }



}








