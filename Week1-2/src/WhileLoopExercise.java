import java.util.Scanner;

public class WhileLoopExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the ages of students (enter -1 to finish):");

        while (true) {
            System.out.print("Student " + (count + 1) + ": ");
            int age = scanner.nextInt();

            if (age == -1) {
                break; // Exit the loop if -1 is entered
            }

            // Process the age or perform any desired operations
            System.out.println("Age of Student " + (count + 1) + ": " + age);

            count++;
        }

        System.out.println("Total number of students: " + count);
        scanner.close();
    }
}
