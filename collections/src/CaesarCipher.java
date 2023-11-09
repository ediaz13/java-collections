import java.util.Scanner;

public class CaesarCipher { //to keep track of index
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String caesarCipher(String input, int shift) {
        // Define the size of the alphabet (26 for English)
        int alphabetSize = 26;

        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (Character.isUpperCase(character)) {
                // Handle uppercase letters
                char shiftedChar = (char) ((character - 'A' + shift) % alphabetSize + 'A');
                result.append(shiftedChar);
            } else if (Character.isLowerCase(character)) {
                // Handle lowercase letters
                char shiftedChar = (char) ((character - 'a' + shift) % alphabetSize + 'a');
                result.append(shiftedChar);
            } else {
                // Keep non-alphabetic characters unchanged
                result.append(character);
            }
        }

        return result.toString();
    }

    // create decryptData() method for decrypting user input string with given shift key
    public static String decryptData(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // decryptStr to store decrypted data
        String decryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {

            // get position of each character of inputStr in ALPHABET
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // get decrypted char for each char of inputStr
            int decryptPos = (pos - shiftKey) % 26;

            // if decryptPos is negative
            if (decryptPos < 0){
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);

            // add decrypted char to decrypted string
            decryptStr += decryptChar;
        }
        // return decrypted string
        return decryptStr;
    }

    public static void main(String[] args) {

        //String message = "Naljnl, Pnrfne jnf n fxvyyrq pbzzhavpngbe, naq ur hfrq n inevrgl bs zrgubqf gb xrrc uvf zrffntrf frperg sebz uvf rarzvrf. Bar bs gurfr zrgubqf jnf gur Pnrfne pvcure, n fvzcyr grpuavdhr gb boshfpngr pbzzhavpngvbaf. SYNT{ebgngr_gung_nycunorg}";
        //FLAG{rotate_that_alphabet}

        String message = "Vhi Nixgnije tkplwr zu a tglpcltzasgtmu sldsxatlvisf czrhij. Ik ks e eoig sshhzutmuakgd zwrjkor gf kje Gsejcr gapygr, azitj uwws r uirylv uhmxt mclyw tf gngjygv tlw eevivw mvuseye. WNAK{yek_xikyy_nktl_at}";


        for (int i = 1; i < 27; i++) {
            System.out.println("\nEncrypted Message: " + i + " " + caesarCipher(message, -i));

        }


        for (int i = 1; i < 27; i++) {
            System.out.println("\nDecrypted Message: " + i + " " + decryptData(message, -i));

        }
    } //main method ends
} //Solution Class End