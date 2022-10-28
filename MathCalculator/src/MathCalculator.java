import java.util.ArrayList;

public class MathCalculator {

    ArrayList<String> results;

    public MathCalculator() {
        results = new ArrayList<>();
    }

    public int gcd(int a, int b) {
        int result = a%b;
        if(result == 0) {
            results.add(String.format("GCD - %d", b));
            return b;
        }
        else
            return gcd(b, result);
    }
}
