import java.util.Scanner;

public class KeyFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int len = scanner.nextInt();
        int arr[] = new int[len];

        for (int i=0; i<=arr.length-1; i++) {
            System.out.println("Enter number in array:");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = scanner.nextInt();
        boolean keyFound = false;

        for (int i=0; i<= arr.length-1; i++) {
            if (arr[i] == key) {
                keyFound = true;
                System.out.println("Key found at index: " + i);
                break;
            } else {

            }
        }

        if (keyFound) {
            System.out.println("Key found!");
        } else {
            System.out.println("Key not found!");
        }
    }

}
