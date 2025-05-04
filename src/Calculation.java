public class Calculation {

    public void scoreCalculation() {
        Scores studentScores = new Scores();
        studentScores.readScores();

        System.out.println("\nLet's calculate the average of the entered grades:");
        System.out.println(studentScores.getFirstNote() + " + " + studentScores.getSecondNote() + " + " + studentScores.getThirdNote() + " + " + studentScores.getFourthNote() + " / 4");

        double average = (studentScores.getFirstNote() + studentScores.getSecondNote() + studentScores.getThirdNote() + studentScores.getFourthNote()) / 4;

        System.out.println("\nThe average is: " + average);
    }
}
