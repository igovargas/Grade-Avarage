import java.util.Scanner;

public class Scores {

    public static void readScores() {

        System.out.println("Hello, this is a program to read grades and calculate your average.");
        System.out.println("Let's enter 4 grades to calculate your average.");

        Scanner input = new Scanner(System.in);

        System.out.println("\nInsert the first note:");
        double firstNote = input.nextDouble();
        System.out.println("The value of the first note is: " + firstNote);

        System.out.println("\nInsert the second note:");
        double secondNote = input.nextDouble();
        System.out.println("The value of the second note is: " + secondNote);

        System.out.println("\nInsert the third note:");
        double thirdNote = input.nextDouble();
        System.out.println("The value of the third note is: " + thirdNote);

        System.out.println("\nInsert the fourth note:");
        double fourthNote = input.nextDouble();
        System.out.println("The value of the fourth note is: " + fourthNote);

        input.close();
    }
}
