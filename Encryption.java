import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get shift value from user

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); 

        CaesarCipher cipher = new CaesarCipher(shift);

        // Get message from user

        System.out.print("Enter the message you wnat to encript: ");
        String message = scanner.nextLine();

        String encryptedMessage = cipher.encrypt(message);
        String decryptedMessage = cipher.decrypt(encryptedMessage);

        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }
}
