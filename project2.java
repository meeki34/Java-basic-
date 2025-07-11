import java.util.*;

public class project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("b is greater than a");

        }
        if (a > b == true) {
            System.out.println("a is greater than b");
        }
    }

}
