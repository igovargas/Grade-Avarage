import java.util.Scanner;

public class Scores {

    double firstNote;
    double secondNote;
    double thirdNote;
    double fourthNote;

    public double getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(double firstNote) {
        this.firstNote = firstNote;
    }

    public double getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(double secondNote) {
        this.secondNote = secondNote;
    }

    public double getThirdNote() {
        return thirdNote;
    }

    public void setThirdNote(double thirdNote) {
        this.thirdNote = thirdNote;
    }

    public double getFourthNote() {
        return fourthNote;
    }

    public void setFourthNote(double fourthNote) {
        this.fourthNote = fourthNote;
    }

    public void readScores() {

        System.out.println("Hello, this is a program to read grades and calculate your average.");
        System.out.println("Let's enter 4 grades to calculate your average.");

        Scanner input = new Scanner(System.in);

        System.out.println("\nInsert the first note:");
        setFirstNote(input.nextDouble());
        System.out.println("The value of the first note is: " + getFirstNote());

        System.out.println("\nInsert the second note:");
        setSecondNote(input.nextDouble());
        System.out.println("The value of the second note is: " + getSecondNote());

        System.out.println("\nInsert the third note:");
        setThirdNote(input.nextDouble());
        System.out.println("The value of the third note is: " + getThirdNote());

        System.out.println("\nInsert the fourth note:");
        setFourthNote(input.nextDouble());
        System.out.println("The value of the fourth note is: " + getFourthNote());

        input.close();
    }

    
}
