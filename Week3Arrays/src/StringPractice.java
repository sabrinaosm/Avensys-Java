public class StringPractice {
    public static void main(String[] args) {
        String s1 = new String("Java Class: Week 3!");
        System.out.println(s1);
        System.out.println("*************************");
        System.out.println("toLowerCase() - Example");
        System.out.println(s1.toLowerCase());
        System.out.println("*************************");
        System.out.println("toUpperCase() - Example");
        System.out.println(s1.toUpperCase());
        System.out.println("*************************");
        System.out.println("contains - False Example");
        System.out.println(s1.contains("class"));
        System.out.println("*************************");
        System.out.println("contains - True Example");
        System.out.println(s1.contains("Class"));
        System.out.println("*************************");
        System.out.println("Retrieving Index Example");
        System.out.println(s1.indexOf("a"));
        System.out.println("*************************");
        System.out.println("charAt() - Example");
        System.out.println(s1.charAt(7));
        System.out.println("*************************");
        System.out.println("substring() - Example");
        System.out.println(s1.substring(12));
        System.out.println("*************************");
        System.out.println("substring(start, end) - Example");
        System.out.println(s1.substring(12,17));
    }
}
