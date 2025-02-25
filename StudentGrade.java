import java.util.Scanner;

public class StudentGrade {
    
    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        
        // Validate user input to ensure it's a valid number
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        
        // Read and return the entered score
        return scanner.nextDouble();
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();

        // Calculate the grade based on the score
        String grade = calculateGrade(score);

        // Display the result
        System.out.println("Your score is: " + score);
        System.out.println("Your Grade is: " + grade);
    }
}
