public class Main {
    public static void main(String[] args) {
        try {
            MortgageCalculator mortgageCalculator = new MortgageCalculator();
            System.out.println(mortgageCalculator.resultEMI());
        }catch(Exception e){
            System.out.println("Error while in mortgage calculator :"+ e.getMessage());
        }

    }
}
