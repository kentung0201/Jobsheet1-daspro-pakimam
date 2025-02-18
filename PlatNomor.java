import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] CITY = {
                {'B', 'a', 'n', 't', 'e', 'n', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'J', 'a', 'k', 'a', 'r', 't', 'a', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'B', 'a', 'n', 'd', 'u', 'n', 'g', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'C', 'i', 'r', 'e', 'b', 'o', 'n', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'B', 'o', 'g', 'o', 'r', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'P', 'e', 'k', 'a', 'l', 'o', 'n', 'g', 'a', 'n', '\0', '\0'},
                {'S', 'e', 'm', 'a', 'r', 'a', 'n', 'g', '\0', '\0', '\0', '\0', '\0'},
                {'S', 'u', 'r', 'a', 'b', 'a', 'y', 'a', '\0', '\0', '\0', '\0'},
                {'M', 'a', 'l', 'a', 'n', 'g', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'T', 'e', 'g', 'a', 'l', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plate code: ");
        char inputCode = scanner.next().toUpperCase().charAt(0);

        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == inputCode) {
                System.out.print("City name: ");
                for (int j = 0; j < CITY[i].length; j++) {
                    if (CITY[i][j] != '\0') {
                        System.out.print(CITY[i][j]);
                    } else {
                        break;
                    }
                }
                System.out.println();
                return;
            }
        }

        System.out.println("Plate code not found.");
        scanner.close();
    }
}
