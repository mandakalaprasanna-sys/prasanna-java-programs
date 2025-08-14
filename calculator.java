import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number:");
        double a = sc.nextDouble();
        System.out.print("Operator(+ - * /):");
        char op = sc.next().charAt(0);
        System.out.print("Second number:");
        double b=sc.nextDouble();
        if (op == '+')
            System.out.println("Result:" + (a + b));
        else if (op == '-')
            System.out.println("Result:" + (a - b));
        else if (op == '*')
            System.out.println("Result:" + (a * b));
        else if (op == '/')
            System.out.println(b != 0 ? "result:" + (a / b) : "Cannot divide by zero");
        else System.out.println("invalid operator");
    }
}
