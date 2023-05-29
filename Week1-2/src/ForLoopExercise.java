import java.util.Scanner;

public class ForLoopExercise {
    public static void main(String[] args) {
        // For Loop - Exercise
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        for (int i=0; i<=9; i++) {
            System.out.println("Please enter the ages: " + (i+1));
            a[i] = scanner.nextInt();
        }

        System.out.println("The ages are presented as follows: ");
        for (int j = 0; j <= 9; j++) {
            System.out.println((j+1) + ". The age of each student is: " + a[j]);
        }
    }
}
