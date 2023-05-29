import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        // 3D Array
        Scanner scanner = new Scanner(System.in);
        int a[][][] = new int [3][3][4];
        System.out.println("Enter data into array:");
        for (int i =0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 3; k++) {
                    System.out.println("College No. " + (i+1) + ", Class No. " + (j+1) + ", Marks of Selected Student No. " + (k+1) + ":");
                    a[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("College, class and marks of students:");
        for (int i=0; i<=2; i++) {
            for (int j=0; j<=2; j++) {
                for (int k=0; k<=3; k++) {
                    System.out.println("College: " + a[i] + ", Class: " + a[j] + ", Student Marks: " + a[k]);
                }
            }
        }
    }
}
