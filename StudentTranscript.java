import java.util.Scanner;

public class StudentTranscript {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Student information
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        String id = input.nextLine();

        // Subjects and marks
        System.out.print("Enter mark for Java: ");
        double java = input.nextDouble();

        System.out.print("Enter mark for Database: ");
        double database = input.nextDouble();

        System.out.print("Enter mark for Networking: ");
        double networking = input.nextDouble();

        System.out.print("Enter mark for Mathematics: ");
        double mathematics = input.nextDouble();

        // Calculate total and average
        double total = java + database + networking + mathematics;
        double average = total / 4;

        // Determine grade
        String grade;

        if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display transcript
        System.out.println("\n===== STUDENT TRANSCRIPT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("------------------------------");
        System.out.println("Java: " + java);
        System.out.println("Database: " + database);
        System.out.println("Networking: " + networking);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("------------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}