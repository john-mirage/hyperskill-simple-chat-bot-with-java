package bot;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static String askForNonEmptyString() {
        while (true) {
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                return name;
            } else {
                System.out.println("Error! Please enter a non empty string: ");
            }
        }
    }

    public static int askForPositiveNumber() {
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error! Please enter a positive number: ");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a number: ");
            }
        }
    }

    public static int askForNumberBetween(int min, int max) {
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Error! Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a number: ");
            }
        }
    }
}
