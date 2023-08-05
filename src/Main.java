import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a month
        String userMonth = scanner.nextLine().toLowerCase();

        // Print test
        System.out.println(userMonth);
    }
}
