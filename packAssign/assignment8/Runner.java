import static java.lang.Math.*;
import com.bank.util.InterestCalculator;

public class Runner {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();
        double si = ic.calculateSimpleInterest(1000, 5, 2);
        double ci = ic.calculateCompoundInterest(1000, 5, 2);
        System.out.println(si);
        System.out.println(ci);
        System.out.println(pow(2,3));
    }
}
