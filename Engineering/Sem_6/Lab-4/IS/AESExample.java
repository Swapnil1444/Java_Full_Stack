import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESExample {

    public static void main(String[] args) throws Exception {

        // Generate AES Key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

        keyGenerator.init(128);

        SecretKey secretKey = keyGenerator.generateKey();

        // Original Message
        String plainText = "Hello World";

        System.out.println("Original Text: " + plainText);

        // Create AES Cipher
        Cipher cipher = Cipher.getInstance("AES");

        // Encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes =
                cipher.doFinal(plainText.getBytes());

        String encryptedText =
                Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted Text: " + encryptedText);

        // Decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedBytes =
                cipher.doFinal(Base64.getDecoder().decode(encryptedText));

        String decryptedText = new String(decryptedBytes);

        System.out.println("Decrypted Text: " + decryptedText);
    }
}