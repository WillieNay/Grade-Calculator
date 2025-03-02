import java.util.Scanner;

public class GradeCalculator {

    private int mark;

    public GradeCalculator(int mark) {
        this.mark = mark;
    }

    public String calculateGrade() {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayGrade() {
        String grade = calculateGrade();
        System.out.println("The student has received a " + grade + " grade.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();

        GradeCalculator calculator = new GradeCalculator(mark);
        calculator.displayGrade();

        scanner.close(); // Close the scanner to prevent resource leaks.
    }
}