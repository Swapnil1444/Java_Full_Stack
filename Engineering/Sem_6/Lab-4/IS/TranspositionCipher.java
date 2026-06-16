import java.util.Scanner;

public class TranspositionCipher {

    // Encryption Method
    public static String encrypt(String text) {

        StringBuilder encrypted = new StringBuilder();

        // Add characters at even positions
        for (int i = 0; i < text.length(); i += 2) {
            encrypted.append(text.charAt(i));
        }

        // Add characters at odd positions
        for (int i = 1; i < text.length(); i += 2) {
            encrypted.append(text.charAt(i));
        }

        return encrypted.toString();
    }

    // Decryption Method
    public static String decrypt(String cipher) {

        int len = cipher.length();

        char[] decrypted = new char[len];

        int mid = (len + 1) / 2;

        int evenIndex = 0;
        int oddIndex = mid;

        // Place even indexed characters
        for (int i = 0; i < len; i += 2) {
            decrypted[i] = cipher.charAt(evenIndex++);
        }

        // Place odd indexed characters
        for (int i = 1; i < len; i += 2) {
            decrypted[i] = cipher.charAt(oddIndex++);
        }

        return new String(decrypted);
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plain Text: ");
        String plainText = sc.nextLine();

        // Encryption
        String encryptedText = encrypt(plainText);

        System.out.println("\nEncrypted Text: " + encryptedText);

        // Decryption
        String decryptedText = decrypt(encryptedText);

        System.out.println("Decrypted Text: " + decryptedText);

        sc.close();
    }
}