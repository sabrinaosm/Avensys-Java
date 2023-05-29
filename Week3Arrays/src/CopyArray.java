import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        //    Reverse Copied Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        for (int i=0; i<=arr.length-1; i++) {
            System.out.println("Enter number into the array:");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing Original Array: ");
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

        int copiedArr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            copiedArr[i] = arr[arr.length-i-1];
        }

        System.out.println();
        System.out.println("Printing Copied Array:");
        for (int i=0; i <= copiedArr.length-1; i++) {
            System.out.print(copiedArr[i] + " ");
        }
    }

}
