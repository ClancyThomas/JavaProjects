import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many people will participate in this simulation: ");
        int participants = scanner.nextInt();
        System.out.print("Enter the starting balance of everyone's bank account (ex. 10.20): ");
        double startingBalance = scanner.nextDouble();
        System.out.print("Enter how many exchanges will be done in this simulation: ");
        int exchanges = scanner.nextInt();

        Simulator simulation = new Simulator(participants, startingBalance, exchanges);
        simulation.startSimulationWithTextFile();

    }
}
