import java.util.Scanner;  // Corrected import statement

public class Signin {

    private static final String USERNAME = "bhargavi";
    private static final String PASSWORD = "582";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (validateCredentials(inputUsername, inputPassword)) {
            System.out.println("Sign-in successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to validate credentials
    private static boolean validateCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
