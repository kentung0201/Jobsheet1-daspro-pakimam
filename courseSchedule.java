import java.util.Scanner;

public class courseSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int n = input.nextInt();
        input.nextLine();

        String[] courseNames = new String[n];
        int[] creditHours = new int[n];
        int[] semesters = new int[n];
        String[] lectureDays = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");
            System.out.print("Name: ");
            courseNames[i] = input.nextLine();
            System.out.print("Credit Hours: ");
            creditHours[i] = input.nextInt();
            System.out.print("Semester: ");
            semesters[i] = input.nextInt();
            input.nextLine();
            System.out.print("Lecture Day: ");
            lectureDays[i] = input.nextLine();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Courses");
            System.out.println("2. Display Courses on a Specific Day");
            System.out.println("3. Display Courses for a Specific Semester");
            System.out.println("4. Search for a Course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Courses:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(courseNames[i] + " - " + creditHours[i] + " hours, Semester " + semesters[i] + ", " + lectureDays[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter the day: ");
                    String day = input.nextLine();
                    System.out.println("\nCourses on " + day + ":");
                    for (int i = 0; i < n; i++) {
                        if (lectureDays[i].equalsIgnoreCase(day)) {
                            System.out.println(courseNames[i] + " - " + creditHours[i] + " hours, Semester " + semesters[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the semester: ");
                    int semester = input.nextInt();
                    System.out.println("\nCourses in Semester " + semester + ":");
                    for (int i = 0; i < n; i++) {
                        if (semesters[i] == semester) {
                            System.out.println(courseNames[i] + " - " + creditHours[i] + " hours, " + lectureDays[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter course name: ");
                    String searchName = input.nextLine();
                    System.out.println("\nSearch results:");
                    for (int i = 0; i < n; i++) {
                        if (courseNames[i].toLowerCase().contains(searchName.toLowerCase())) {
                            System.out.println(courseNames[i] + " - " + creditHours[i] + " hours, Semester " + semesters[i] + ", " + lectureDays[i]);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        input.close();
    }
}
