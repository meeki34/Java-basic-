import java.util.*;

public class calcular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // what is important for an calcular show result and add , sub ,multiply and
        // divide
        /*
         * int num1, num2;
         * System.out.println("enter the first number");
         * num1 = sc.nextInt();
         * System.out.println("enter the second number");
         * num2 = sc.nextInt();
         * int add = num1 + num2;
         * int sub = num1 - num2;
         * int mul = num1 * num2;
         * int div = num1 / num2;
         * System.out.println("addition of two number is " + add);
         * System.out.println("subtraction of two number is " + sub);
         * System.out.println("multiplication of two number is " + mul);
         * System.out.println("division of two number is " + div);
         */

        char operator;
        Double number1, number2, result;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);
        // ask users to enter two numbers
        System.out.println("Enter two numbers:");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Addition of two number is " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Subtraction of two number is " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Multiplication of two number is " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("Division of two number is " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();

    }
}
