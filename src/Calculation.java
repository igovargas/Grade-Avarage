public class Calculation {

    public void scoreCalculation() {
        Scores studentScores = new Scores();
        studentScores.readScores();

        System.out.println("\nLet's calculate the average of the entered grades:");
        System.out.println(studentScores.getNote1() + " + " + studentScores.getNote2() + " + " + studentScores.getNote3() + " + " + studentScores.getNote4() + " / 4");

        double average = (studentScores.getNote1() + studentScores.getNote2() + studentScores.getNote3() + studentScores.getNote4()) / 4;

        System.out.println("\nThe average is: " + average);

        schoolAvarage(average);
    }

    public static void schoolAvarage(double average) {

        if (average >= 70) {
            System.out.println("You are approved!\n");
        } else if (average < 70 && average >= 50) {
            System.out.println("You need to take a make-up exam.\n");
        } else {
            System.out.println("You have failed.\n");
        }
    }
}


