import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  3D Jagged Array
        int a[][][] = new int [3][][];
        a[0] = new int[3][];
        a[1] = new int[4][];
        a[2] = new int[2][];

        a[0][0] = new int [4];
        a[0][1] = new int[2];
        a[0][2] = new int[3];

        a[1][0] = new int[1];
        a[1][1] = new int[2];
        a[1][2] = new int[4];
        a[1][3] = new int[2];

        a[2][0] = new int[5];
        a[2][1] = new int[2];

        for (int i=0; i<=a.length-1; i++) {
            for (int j=0; j<=a[i].length-1; j++) {
                for (int k=0; k<=a[i][j].length-1; k++) {
                    System.out.println("Enter Bank Code No." + (i+1) + ", Branch No. " + (j+1) + ", Customer Cash Amount No. " + (k+1) + ":");
                    a[i][j][k] = scanner.nextInt();
                }
            }
        }

        for (int i=0; i<=a.length-1; i++) {
            for (int j=0; j<=a[i].length-1; j++) {
                for (int k=0; k<=a[i][j].length-1; k++) {
                    System.out.println("Bank Code No." + (i+1) + ", Branch No. " + (j+1) + ", Customer's Cash Amount No. " + (k+1) + ": $" + a[i][j][k]);
                }
            }
        }

    }
}
