import java.util.Scanner;

class NameComparer
{
    boolean greater(String name1, String name2)
    {
        if(name1.compareTo(name2) > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean containsLetter(String name)
    {
        char nameChar[] = name.toCharArray();
        for (int i = 0; i < nameChar.length; i++)
        {
            if (nameChar[i] == 's' || nameChar[i] == 'S')
            {
                return true;
            }
        }  return false;
    }
}

public class NameCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameComparer compare = new NameComparer();

        System.out.println("Enter a name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter a name:");
        String name2 = scanner.nextLine();

        boolean res = compare.greater(name1, name2);
        boolean res1 = compare.containsLetter(name1);

        if(res) {
            System.out.println(name1 + " is greater than " + name2);
        } else {
            System.out.println(name1 + " is not greater than " + name2);
        }

        if (res1) {
            System.out.println(name1 + " contains the letter 's'!");
        } else {
            System.out.println(name1 + " does not contain the letter 's'!");
        }
    }
}