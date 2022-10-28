import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathCalculator calculator =  new MathCalculator();

        System.out.println("Welcome to the greatest common divisor program!");
        System.out.println("Enter two numbers and this program to find the GCD!");
        System.out.print("Enter the first number: ");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Greatest common divisor is: " + calculator.gcd(numberOne, numberTwo));
    }


}
