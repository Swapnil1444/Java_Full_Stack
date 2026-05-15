import java.security.*;
import javax.crypto.Cipher;
import java.util.Base64;

public class RSAExample {

    public static void main(String[] args) throws Exception {

        // Generate RSA Key Pair
        KeyPairGenerator keyPairGenerator =
                KeyPairGenerator.getInstance("RSA");

        keyPairGenerator.initialize(2048);

        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Original Message
        String plainText = "Hello World";

        System.out.println("Original Text: " + plainText);

        // Create Cipher
        Cipher cipher = Cipher.getInstance("RSA");

        // Encryption using Public Key
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptedBytes =
                cipher.doFinal(plainText.getBytes());

        String encryptedText =
                Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted Text: " + encryptedText);

        // Decryption using Private Key
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decryptedBytes =
                cipher.doFinal(Base64.getDecoder().decode(encryptedText));

        String decryptedText = new String(decryptedBytes);

        System.out.println("Decrypted Text: " + decryptedText);
    }
}