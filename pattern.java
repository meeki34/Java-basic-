public class pattern {
    public static void main(String[] args) {
        /*
         * print the pattern like this
         * 
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4 5 6
         */

        int n = 6; // number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // nested loop to print the numbers
                System.out.print(j + " ");
            }
            System.out.println();
            break;
        }
        /*
         * print the pattern like this
         * 
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * 16 17 18 19 20 21
         */
        // 2 .pattern

        int y = 7;
        int x = 8;

        // outerloop
        for (int a = 1; a <= y; a++) {
            for (int b = 1; b <= x; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int f = 5;
        int v = 5;
        // 3.print the pattern
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= v; j++) {
                if (i == 1 || i == f || j == 1 || j == v) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        // 4
        int z = 9;
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // this basic first print the space and the print the "*"

        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z - i; j++) {
                System.out.print("j");
            }
            System.out.println();

        }

        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;// number = number + 1;
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
