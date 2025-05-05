import java.util.Scanner;

public class Scores {

    double note1;
    double note2;
    double note3;
    double note4;

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double getNote4() {
        return note4;
    }

    public void setNote4(double note4) {
        this.note4 = note4;
    }

    public void readScores() {

        System.out.println("Hello, this is a program to read grades and calculate your average.");
        System.out.println("Let's enter 4 grades to calculate your average.");

        Scanner input = new Scanner(System.in);

        setNote1(readValidNote(input, "first"));
        setNote2(readValidNote(input, "second"));
        setNote3(readValidNote(input, "third"));
        setNote4(readValidNote(input, "fourth"));

        input.close();

    }

    private double readValidNote(Scanner input, String label) {
        double note;
        while (true) {
            System.out.println("\nInsert the " + label + " note:");
            note = input.nextDouble();
            if (note >= -1 && note <= 100) {
                System.out.println("The value of the " + label + " note is: " + note + ".");
                return note;
            } else {
                System.out.println("Invalid grade. Please enter a value between -1 and 100.");
            }
        }
    }

    
}
