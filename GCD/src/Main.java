import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the greatest common divisor program!");
        System.out.println("Enter two numbers and this program with find the GCD!");
        System.out.print("Enter the first number: ");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Greatest common divisor is: " + gcd(numberOne, numberTwo));
    }

    public static int gcd(int a, int b) {
        int result = a%b;
        if(result == 0)
            return b;
        else
            return gcd(b, result);
    }
}
