import java.util.Scanner;

public class PatternExercise {
    public static void main(String[] args) {
//      Triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


//      Right-leaning triangle
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//      Inverted triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

//      A
//      B C
//      D E F
//      G H I J
//      K L M N O
        int alpha = 65;
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }

        System.out.println();

//      5
//      5 4
//      5 4 3
//      5 4 3 2
//      5 4 3 2 1
        for (int i = 5; i >= 1; i--) {
            for (int j=5; j >=i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

//      1
//      0 1
//      1 0 1
//      0 1 0 1
//      1 0 1 0 1
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                if (j%2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println();

//        A
//        B B
//        A A A
//        B B B B
//        A A A A A

        for (int i=0; i < 5; i++) {
            for (int j = 0; j <= i; j ++) {
                if (i%2 == 1) {
                    System.out.print((char)(alpha+1));
                } else {
                    System.out.print((char)alpha);
                }
            }
            System.out.println();
        }

        for (int i = 0; i<=5; i++) {
            for (int j = i; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

//      A
//      B B
//      C C C
//      D D D D
//      E E E E E
//      F F F F F F

        for (int i=0; i<6; i++) {
            alpha++;
            for (int j=0; j<=i; j++) {
                System.out.print((char)(alpha));
            }
            System.out.println();
        }

        System.out.println();

//      E
//      D D
//      C C C
//      B B B B
//      A A A A A

//        char alpha = 'E';
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)alpha);

            } alpha--;
            System.out.println();
        }

//      A
//      C C
//      E E E
//      G G G G
//      I I I I I

        for (int i=0; i < 5; i++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print((char)alpha);
            }
            alpha = alpha + 2;
            System.out.println();
        }

        System.out.println();

//      Print scanner according to the input no.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("This is your pattern: ");

        for (int i=1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (i >= 2 && j >= 2 && i<= n-1 && j<=n-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

//          *^^^^^
//          **^^^^^
//          ***^^^^^
//          ****^^^^^
//          *****^^^^^

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println();

        //  *****^^^^^
        //  *****^^^^^
        //  *****^^^^^
        //  *****^^^^^
        //  *****^^^^^

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= 5; k++) {
                System.out.print("^");
            }

            System.out.println();
        }

        //  *
        //  **
        //  ***
        //  ****
        //  *****

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        //      *****
        //      *****
        //      *****
        //      *****
        //      *****
        //      *****

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //   ** **
        //  *  *  *
        //  *     *
        //   *   *
        //    * *
        //     *
        for (int i=0; i<=5; i++) {
            for (int j=0; j<=6; j++) {
                if ((i-j == 2) || (i+j == 8) || ((i==1) && (j%3 == 0)) || ( i == 0 && (j == 1 || j == 2 || j == 4 || j == 5)) ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();


        //      *
        //     * *
        //    *   *
        //   *     *
        //  *       *
        for (int i=0; i<=4; i++){
            for (int j=0; j<=8; j++) {
                if ((i+j == 4) || (j-i == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //  *
        // * *
        //*   *
        // * *
        //  *

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if ((i-j == 2) || (j-i == 2) || (i+j == 2) || (i+j == 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }

        System.out.println();

        //  * *** *
        //  * * * *
        //  *** ***
        //  *******

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                if ((i+j == 3) || (j-i == 3) || (i == 3 || j%2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
