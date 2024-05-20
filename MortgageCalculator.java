import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String []args){
        System.out.println("Application Started!!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product price: ");
        float productPrice = scanner.nextFloat();
        System.out.println();
        System.out.print("Loan Term (months): ");
        int loanTerm = scanner.nextInt();
        System.out.println();
        System.out.print("Monthly Interest Rate :");
        double interestRate = scanner.nextDouble();
        double monthlyInterestRate = (interestRate /100);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double emi = productPrice * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm)) /
                (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);
        System.out.println(emi);
    }
}
