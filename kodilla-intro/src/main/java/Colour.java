import java.util.Scanner;

public class Colour {
    public static String getVerification() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Try again. Name is too short");
        }
    }

    public static String getContinue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type 'Continue' to see the result");
            String input = scanner.nextLine();
            if (input.equals("Continue") || input.equals("continue")) {
                return input;
            } else {
                System.out.println("You misspelled CONTINUE. Try again.");
            }
        }
    }


    public static String firstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme first letter of the colour (Y, B, P, R, O)");
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("U need to gimme only 1 letter");
            return firstLetter();
        }
        return input;

    }

    public static String getColour(String firstLetter) {
        Colour.getContinue();
        return switch (firstLetter) {
            case "y", "Y" -> "Yellow";
            case "b", "B" -> "blue";
            case "p", "P" -> "Purple";
            case "r", "R" -> "Red";
            case "o", "O" -> "Orange";
            default -> "Colour not in the program";
        };
    }


    public static void main(String[] args) {

        String urName = Colour.getVerification();
        System.out.println("Your name is: " + urName);

        String firstLetter = Colour.firstLetter();
        System.out.println("Ur letter is" + " " + firstLetter);

        String colour = Colour.getColour(firstLetter);
        System.out.println("Ur colour is " + colour);
    }

}
