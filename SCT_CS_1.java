import java.util.Scanner;
public class SCT_CS_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = sc.nextLine();
        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();
        String encrypted = "";
        String decrypted = "";

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
                encrypted = encrypted + ch;

            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + shift) % 26 + 'a');
                encrypted = encrypted + ch;

            } else {
                encrypted = encrypted + ch;
            }
        }
        for (int i = 0; i < encrypted.length(); i++) {

            char ch = encrypted.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' - shift + 26) % 26 + 'A');
                decrypted = decrypted + ch;

            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                decrypted = decrypted + ch;

            } else {
                decrypted = decrypted + ch;
            }
        }
        System.out.println("\nEncrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
        sc.close();
    }
}