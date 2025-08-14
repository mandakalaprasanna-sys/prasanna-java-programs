import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        // Calculate sum of digits of the square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        // Check if sum equals original number
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
        sc.close();
    }
}
