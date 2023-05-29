class Calculator {
    // Type 1: No I/P and No O/P
    void add() {
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println(c);
    }

    // Type 2: I/P and No O/P
    void deduct(int x, int y)
    {
        int k = x - y;
        System.out.println(k);

    }

    // Type 3: No I/P and O/P
    int divide() {
        int a = 10;
        int b = 2;
        int c = 10 / 2;
        return c;
    }

    // Type 4: I/P and O/P
    int additioner(int x, int y) {
        int c = x + y;
        return c;
    }
}

public class IOOP {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.divide();
        System.out.println(res);
        int res1 = c.additioner(5, 7);
        System.out.println(res1);
    }
}
