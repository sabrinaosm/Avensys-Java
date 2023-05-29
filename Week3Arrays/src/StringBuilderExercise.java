import java.lang.*;

public class StringBuilderExercise {
    public static void main(String[] args) {
    // StringBuilder Example
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("equals: " + sb.equals(sb));
    System.out.println("****************************");
    System.out.println("append(): " + sb.append(" world"));
    System.out.println("****************************");
    System.out.println("compareTo: " + sb.compareTo(sb));
    System.out.println("****************************");
    System.out.println("indexOf: " + sb.indexOf("o"));
    System.out.println("****************************");
    System.out.println("charAt(): " + sb.charAt(3));
    System.out.println("****************************");
    System.out.println("Substring: " + sb.substring(0));
    System.out.println("****************************");
    System.out.println("Substring: " + sb.substring(0,5));
    System.out.println("****************************");
    System.out.println("Insert: "+ sb.insert(0, "!!"));
    System.out.println("****************************");
    System.out.println("Reverse: " + sb.reverse());
    System.out.println("****************************");
    System.out.println("Length: " + sb.length());
    System.out.println("****************************");
    System.out.println("Capacity: " + sb.capacity());
    sb.ensureCapacity(50);
    System.out.println("****************************");
    System.out.println("Minimum capacity changed to 50:");
    System.out.println("New Capacity: " + sb.capacity());
    }
}
