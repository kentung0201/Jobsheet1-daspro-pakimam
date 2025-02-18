import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double side;

        while (true) {
            System.out.println("Choose calculation:");
            System.out.println("1. Volume");
            System.out.println("2. Surface Area");
            System.out.println("3. Perimeter");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter cube side length: ");
            side = input.nextDouble();

            if (choice == 1) {
                System.out.println("Cube volume: " + (side * side * side));
            } else if (choice == 2) {
                System.out.println("Cube surface area: " + (6 * side * side));
            } else if (choice == 3) {
                System.out.println("Cube perimeter: " + (12 * side));
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Thank you!");
        input.close();
    }
}
