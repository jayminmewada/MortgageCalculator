import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public String resultEMI(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Application Started!!");
            System.out.print("Product price: ");
            float productPrice = scanner.nextFloat();
            System.out.println();
            System.out.print("Loan Term (months): ");
            int loanTerm = scanner.nextInt();
            System.out.println();
            System.out.print("Monthly Interest Rate :");
            double interestRate = scanner.nextDouble();
            double monthlyInterestRate = (interestRate / 100);
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            double emi = productPrice * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm)) /
                    (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);
            scanner.close();
            return currency.format(emi);
        } catch (Exception e) {
            System.out.println("Error in mortgage calculator");
        }
        return null;
    }
}
