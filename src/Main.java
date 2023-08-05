import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask user for a month
        System.out.println("Benvenuto, dimmi il nome di un mese dell'anno e ti dirò il numero di giorni di cui è composto");
        String userMonth = scanner.nextLine().toLowerCase();

        // Switch case
        int daysNum;
        switch (userMonth) {
            case "gennaio":
            daysNum = 31;
            break;
            case "febbraio":
            daysNum = 31;
            break;
            case "marzo":
            daysNum = 31;
            break;
            case "aprile":
            daysNum = 31;
            break;
            case "maggio":
            daysNum = 31;
            break;
            case "giugno":
            daysNum = 31;
            break;
            case "luglio":
            daysNum = 31;
            break;
            case "agosto":
            daysNum = 31;
            break;
            case "settembre":
            daysNum = 31;
            break;
            case "ottobre":
            daysNum = 31;
            break;
            case "novembre":
            daysNum = 31;
            break;
            case "dicembre":
            daysNum = 31;
            break;
            default:
                daysNum = 0;
        }

        // Print test
        System.out.println(userMonth + " " + daysNum);
    }
}
