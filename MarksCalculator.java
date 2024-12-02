package STUDENT_GRADE_CALCULATOR_TASK_TWO;
import java.util.Scanner;
public class MarksCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate input
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                System.out.print("Enter marks for subject " + i + " again: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / subjects;

        // Determine grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
